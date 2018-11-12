/**
 * 
 */
package com.sudhindra.app.controller;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudhindra.app.exception.ResourceNotFoundException;
import com.sudhindra.app.model.City;
import com.sudhindra.app.repository.CityRepository;
import com.sudhindra.app.service.CityServiceImpl;
import com.sudhindra.app.service.ICityService;

/**
 * @author Sudhindra
 *
 */
@RestController
@RequestMapping("/api/city")
public class CityController {

	@Autowired
	private ICityService cityService;

	@GetMapping("/listcity")
	public List<City> getCities() {
		return cityService.getAllCities();
	}

	@GetMapping("/listcity/{id}")
	public ResponseEntity<City> getCityById(@PathVariable(value = "id") Long cityId) throws ResourceNotFoundException {
		City city = cityService.getCity(cityId)
				.orElseThrow(() -> new ResourceNotFoundException("Result not found for this id :: " + cityId));
		return ResponseEntity.ok().body(city);
	}

	@GetMapping("/uptime")
	public ResponseEntity<String> getUptime() throws ResourceNotFoundException {
		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
		return ResponseEntity.ok().body(String.valueOf(runtimeMXBean.getUptime()));
	}
}