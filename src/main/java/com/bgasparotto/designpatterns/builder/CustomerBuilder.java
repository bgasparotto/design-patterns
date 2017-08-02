package com.bgasparotto.designpatterns.builder;

/**
 * <p>
 * Interface which defines the contract for the {@code Builder} design pattern
 * implementations for the {@link Customer} class.
 * </p>
 * <p>
 * Any {@link Customer}'s <em>builder</em> implementation should implement this
 * interface.
 * </p>
 * 
 * @author Bruno Gasparotto
 * 
 * @see <a href= "http://bgasparotto.com/design-patterns/builder">bgasparotto -
 *      Builder</a>
 *
 */
public interface CustomerBuilder {

	/**
	 * Defines a {@code cityName} on the current instance being built
	 * 
	 * @param cityName
	 *            The customer's {@code cityName}
	 * @return {@code this} builder instance
	 */
	CustomerBuilder fromCity(String cityName);

	/**
	 * Adds a {@code phoneNumber} on the current instance being built
	 * 
	 * @param phoneNumber
	 *            The customer's {@code phoneNumber} to be added
	 * @return {@code this} builder instance
	 */
	CustomerBuilder hasPhone(String phoneNumber);

	/**
	 * Builds and return the instance being build
	 * 
	 * @return the instance being build
	 */
	Customer build();
}