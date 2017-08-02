package com.bgasparotto.designpatterns.builder;

import java.util.HashSet;
import java.util.Set;

/**
 * Entity that represents a {@code Customer} of the system.
 * 
 * @author Bruno Gasparotto
 *
 */
public class Customer {
	private long id;
	private String name;
	private String city;
	private Set<Phone> phones;

	/**
	 * <p>
	 * Constructor.
	 * </p>
	 *
	 * @param id
	 *            The customer's {@code id}
	 * @param name
	 *            The customer's {@code name}
	 * @param city
	 *            The customer's {@code city}
	 * @param phones
	 *            The customer's {@code phones}
	 */
	public Customer(long id, String name, String city, Set<Phone> phones) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.phones = phones;
	}

	/**
	 * <p>
	 * Constructor.
	 * </p>
	 *
	 * @param name
	 *            The customer's {@code name}
	 * @param city
	 *            The customer's {@code city}
	 * @param phones
	 *            The customer's {@code phones}
	 */
	public Customer(String name, String city, Set<Phone> phones) {
		this(0, name, city, phones);
	}

	/**
	 * <p>
	 * Constructor.
	 * </p>
	 *
	 * @param name
	 *            The customer's {@code name}
	 */
	public Customer(String name) {
		this(0, name, null, new HashSet<Phone>());
	}

	/**
	 * Gets the {@code Customer}'s {@code id}.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Gets the {@code Customer}'s {@code name}.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the {@code Customer}'s {@code city}.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Gets the {@code Customer}'s {@code phones}.
	 *
	 * @return the phones
	 */
	public Set<Phone> getPhones() {
		return phones;
	}

	/**
	 * Sets the {@code Customer}'s {@code id}.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Sets the {@code Customer}'s {@code name}.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the {@code Customer}'s {@code city}.
	 *
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets the {@code Customer}'s {@code phones}.
	 *
	 * @param phones
	 *            the phones to set
	 */
	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", city=");
		builder.append(city);
		builder.append(", phones=");
		builder.append(phones);
		builder.append("]");
		return builder.toString();
	}
}