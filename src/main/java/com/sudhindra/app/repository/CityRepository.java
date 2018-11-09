/**
 * 
 */
package com.sudhindra.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudhindra.app.model.City;

/**
 * @author Sudhindra
 *
 */

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}