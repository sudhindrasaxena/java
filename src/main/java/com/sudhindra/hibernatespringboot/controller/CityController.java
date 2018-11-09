/**
 * 
 */
package com.sudhindra.hibernatespringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudhindra.hibernatespringboot.entity.City;
import com.sudhindra.hibernatespringboot.exception.ResourceNotFoundException;
import com.sudhindra.hibernatespringboot.repository.CityRepository;

/**
 * @author Sudhindra
 *
 */
@RestController
@RequestMapping("/api/v1")
public class CityController {
	@Autowired
	private CityRepository cityRepository;

	@GetMapping("/cities")
	public List<City> getAllEmployees() {
		return cityRepository.findAll();
	}

	@GetMapping("/cities/{id}")
	public ResponseEntity<City> getEmployeeById(@PathVariable(value = "id") Long cityId)
			throws ResourceNotFoundException {
		City city = cityRepository.findById(cityId)
				.orElseThrow(() -> new ResourceNotFoundException("Result not found for this id :: " + cityId));
		return ResponseEntity.ok().body(city);
	}
}
