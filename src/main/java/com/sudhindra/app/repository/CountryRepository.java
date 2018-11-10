/**
 * 
 */
package com.sudhindra.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudhindra.app.model.Country;

/**
 * @author Sudhindra
 *
 */
public interface CountryRepository extends JpaRepository<Country, String> {
}
