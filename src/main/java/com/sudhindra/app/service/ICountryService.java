/**
 * 
 */
package com.sudhindra.app.service;

import java.util.List;
import java.util.Optional;

import com.sudhindra.app.model.City;
import com.sudhindra.app.model.Country;

/**
 * @author Sudhindra
 *
 */
public interface ICountryService {
	Country addCountry(Country country);

	Optional<Country> getCountry(String countryCode);
	Country editCountry(Country Country);

	void deleteCountry(Country country);
	void deleteCountry(String countryCode);

	List<Country> getAllCountry(int pageNumber, int pageSize);
	List<Country> getAllCountry();
	
	List<City> findAllCitiesInCountry(String countrycode);

	long countCountry();
}
