/**
 * 
 */
package com.sudhindra.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sudhindra
 *
 */
@Entity
@Table(name = "city")
public class City {

	private long id;
	private String name;
	private String countryCode;
	private String district;
	private String info;

	public City() {
	}
	
	/**
	 * @param name
	 * @param countryCode
	 * @param district
	 * @param info
	 */
	public City(String name, String countryCode, String district, String info) {
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.info = info;
	}

	/**
	 * @return the id
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the countryCode
	 */
	@Column(name = "countrycode", nullable = false)
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the district
	 */
	@Column(name = "district", nullable = false)
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the info
	 */
	@Column(name = "info", nullable = false)
	public String getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("City [id=%s, name=%s, countryCode=%s, district=%s, info=%s]", id, name, countryCode,
				district, info);
	}
	
	

}
