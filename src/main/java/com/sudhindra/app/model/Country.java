/**
 * 
 */
package com.sudhindra.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sudhindra
 *
 */
@Entity
@Table(name = "country")
public class Country {
	private String code;
	private String name;
	private long capital;
	private String code2;

	public Country() {
	}

	/**
	 * @param code
	 * @param name
	 * @param capital
	 * @param code2
	 */
	public Country(String code, String name, long capital, String code2) {
		this.code = code;
		this.name = name;
		this.capital = capital;
		this.code2 = code2;
	}

	/**
	 * @return the code
	 */
	@Id
	@Column(name="code",nullable = false)
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	@Column(name="name")
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
	 * @return the capital
	 */
	@Column(name="capital")
	public long getCapital() {
		return capital;
	}

	/**
	 * @param capital the capital to set
	 */
	public void setCapital(long capital) {
		this.capital = capital;
	}

	/**
	 * @return the code2
	 */
	@Column(name="code2")
	public String getCode2() {
		return code2;
	}

	/**
	 * @param code2 the code2 to set
	 */
	public void setCode2(String code2) {
		this.code2 = code2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Country [code=%s, name=%s, capital=%s, code2=%s]", code, name, capital, code2);
	}

}
