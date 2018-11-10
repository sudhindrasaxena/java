/**
 * 
 */
package com.sudhindra.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudhindra.app.exception.ResourceNotFoundException;
import com.sudhindra.app.model.Country;
import com.sudhindra.app.service.ICountryService;

/**
 * @author Sudhindra
 *
 */
@RestController
@RequestMapping("/api/country")
public class CountryController {
	
	@Autowired
	ICountryService countryService;
	
	@GetMapping("/listcountry")
	public List<Country> getAllCountries() {
		return countryService.getAllCountry();
	}

	@GetMapping("/listcountry/{code}")
	public ResponseEntity<Country> getCountryById(@PathVariable(value = "code") String countryCode)
			throws ResourceNotFoundException {
		Country country = countryService.getCountry(countryCode)
				.orElseThrow(() -> new ResourceNotFoundException("Result not found for this id :: " + countryCode));
		return ResponseEntity.ok().body(country);
	}
}
