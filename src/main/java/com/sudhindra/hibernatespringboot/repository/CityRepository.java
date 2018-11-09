/**
 * 
 */
package com.sudhindra.hibernatespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudhindra.hibernatespringboot.entity.City;

/**
 * @author Sudhindra
 *
 */

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}