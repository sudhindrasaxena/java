/**
 * 
 */
package com.sudhindra.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudhindra.app.model.City;
import com.sudhindra.app.model.Country;

/**
 * @author Sudhindra
 *
 */
public interface CountryRepository extends JpaRepository<Country, String> {
}
