/**
 * 
 */
package com.sudhindra.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sudhindra.app.model.City;
import com.sudhindra.app.repository.CityRepository;

/**
 * @author Sudhindra
 *
 */
@Service
public class CityServiceImpl implements ICityService {

	@Autowired
	private CityRepository cityRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sudhindra.app.service.ICityService#addCity(com.sudhindra.app.model.City)
	 */
	@Override
	public City addCity(City city) {
		return cityRepository.save(city);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sudhindra.app.service.ICityService#getCity(java.lang.Long)
	 */
	@Override
	public Optional<City> getCity(Long id) {
		return cityRepository.findById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sudhindra.app.service.ICityService#editCity(com.sudhindra.app.model.City)
	 */
	@Override
	public City editCity(City city) {
		return cityRepository.save(city);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sudhindra.app.service.ICityService#deleteCity(com.sudhindra.app.model.
	 * City)
	 */
	@Override
	public void deleteCity(City city) {
		cityRepository.delete(city);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sudhindra.app.service.ICityService#deleteCity(java.lang.Long)
	 */
	@Override
	public void deleteCity(Long id) {
		cityRepository.deleteById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sudhindra.app.service.ICityService#getAllCity(int, int)
	 */
	@Override
	public List<City> getAllCity(int pageNumber, int pageSize) {
		return cityRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sudhindra.app.service.ICityService#getAllCities()
	 */
	@Override
	public List<City> getAllCities() {
		return cityRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sudhindra.app.service.ICityService#countCities()
	 */
	@Override
	public long countCities() {
		return cityRepository.count();
	}

}
