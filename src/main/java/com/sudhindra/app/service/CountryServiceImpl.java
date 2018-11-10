/**
 * 
 */
package com.sudhindra.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sudhindra.app.model.Country;
import com.sudhindra.app.repository.CountryRepository;

/**
 * @author Sudhindra
 *
 */
@Service
public class CountryServiceImpl implements ICountryService {

	@Autowired
	CountryRepository countryRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sudhindra.app.service.ICountryService#addCountry(com.sudhindra.app.model.
	 * Country)
	 */
	@Override
	public Country addCountry(Country country) {
		return countryRepository.save(country);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sudhindra.app.service.ICountryService#getCountry(java.lang.String)
	 */
	@Override
	public Optional<Country> getCountry(String countryCode) {
		return countryRepository.findById(countryCode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sudhindra.app.service.ICountryService#editCountry(com.sudhindra.app.model
	 * .Country)
	 */
	@Override
	public Country editCountry(Country country) {
		return countryRepository.save(country);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sudhindra.app.service.ICountryService#deleteCountry(com.sudhindra.app.
	 * model.Country)
	 */
	@Override
	public void deleteCountry(Country country) {
		countryRepository.delete(country);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sudhindra.app.service.ICountryService#deleteCountry(java.lang.String)
	 */
	@Override
	public void deleteCountry(String countryCode) {
		countryRepository.deleteById(countryCode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sudhindra.app.service.ICountryService#getAllCountry(int, int)
	 */
	@Override
	public List<Country> getAllCountry(int pageNumber, int pageSize) {
		return countryRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sudhindra.app.service.ICountryService#getAllCountry()
	 */
	@Override
	public List<Country> getAllCountry() {
		return countryRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sudhindra.app.service.ICountryService#countCountry()
	 */
	@Override
	public long countCountry() {
		return countryRepository.count();
	}

}
