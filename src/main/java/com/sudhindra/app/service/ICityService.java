/**
 * 
 */
package com.sudhindra.app.service;

import java.util.List;
import java.util.Optional;

import com.sudhindra.app.model.City;

/**
 * @author Sudhindra
 *
 */
public interface ICityService {
	City addCity(City city);

	Optional<City> getCity(Long id);
	City editCity(City city);

	void deleteCity(City city);
	void deleteCity(Long id);

	List<City> getAllCity(int pageNumber, int pageSize);
	List<City> getAllCities();

	long countCities();
}
