package com.bgasparotto.designpatterns.builder;

import java.util.Set;

/**
 * <p>
 * Client class simulating the creation of a {@code Customer} instance.
 * </p>
 * <p>
 * This class has a {@code main} method in order to run code for studying
 * purposes, it shouldn't be taken as a reference for object-oriented paradigm
 * besides the design pattern demonstration.
 * </p>
 * 
 * @author Bruno Gasparotto
 *
 */
public class Client {
	private Customer customer;

	/**
	 * Instantiates a customer avoiding the use of the pattern.
	 */
	private void noArgumentsWithoutBuilder() {
		customer = new Customer("Bruno");
	}

	/**
	 * Instantiates a customer using the pattern.
	 */
	private void noArgumentsWithBuilder() {
		CustomerBuilder builder = new CustomerBuilderImpl("Bruno");
		customer = builder.build();
	}

	/**
	 * Instantiates a customer avoiding the use of the pattern plus setting a
	 * city name.
	 */
	private void oneExtraArgumentWithoutBuilder() {
		customer = new Customer("Bruno");
		customer.setCity("Sao Paulo");
	}

	/**
	 * Instantiates a customer using the pattern plus setting a city name.
	 */
	private void oneExtraArgumentWithBuilder() {
		CustomerBuilder builder = new CustomerBuilderImpl("Bruno");
		customer = builder.fromCity("Sao Paulo").build();
	}

	/**
	 * Instantiates a customer avoiding the use of the pattern plus setting a
	 * city name and adding a phone number.
	 */
	private void allArgumentsWithoutBuilder() {
		customer = new Customer("Bruno");
		customer.setCity("Sao Paulo");

		Phone mobile = new Phone("999999999");
		Set<Phone> phones = customer.getPhones();
		phones.add(mobile);
	}

	/**
	 * Instantiates a customer using the pattern plus setting a city name and
	 * adding a phone number.
	 */
	private void allArgumentsWithBuilder() {
		CustomerBuilder builder = new CustomerBuilderImpl("Bruno");
		customer = builder.fromCity("Sao Paulo").hasPhone("999999999").build();
	}

	/**
	 * Runs every instantiation example printing the result to the console.
	 * 
	 * @param args
	 *            args
	 */
	public static void main(String[] args) {
		Client client = new Client();

		client.noArgumentsWithoutBuilder();
		System.out.println(client.customer);

		client.noArgumentsWithBuilder();
		System.out.println(client.customer);

		client.oneExtraArgumentWithoutBuilder();
		System.out.println(client.customer);

		client.oneExtraArgumentWithBuilder();
		System.out.println(client.customer);

		client.allArgumentsWithoutBuilder();
		System.out.println(client.customer);

		client.allArgumentsWithBuilder();
		System.out.println(client.customer);
	}
}