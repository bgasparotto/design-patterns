package com.bgasparotto.designpatterns.builder;

import java.util.Set;

/**
 * <p> Client class simulating the creation of a {@code Customer} instance.
 *
 * <p> This class has a {@code main} method in order to run code for studying purposes, it shouldn't be taken as a
 * reference for object-oriented paradigm besides the design pattern demonstration.
 */
public class Client {
    private Customer customer;

    private void noArgumentsWithoutBuilder() {
        customer = new Customer("Bruno");
    }

    private void noArgumentsWithBuilder() {
        CustomerBuilder builder = new CustomerBuilderImpl("Bruno");
        customer = builder.build();
    }

    private void oneExtraArgumentWithoutBuilder() {
        customer = new Customer("Bruno");
        customer.setCity("Sao Paulo");
    }

    private void oneExtraArgumentWithBuilder() {
        CustomerBuilder builder = new CustomerBuilderImpl("Bruno");
        customer = builder.fromCity("Sao Paulo").build();
    }

    private void allArgumentsWithoutBuilder() {
        customer = new Customer("Bruno");
        customer.setCity("Sao Paulo");

        Phone mobile = new Phone("999999999");
        Set<Phone> phones = customer.getPhones();
        phones.add(mobile);
    }

    private void allArgumentsWithBuilder() {
        CustomerBuilder builder = new CustomerBuilderImpl("Bruno");
        customer = builder.fromCity("Sao Paulo").hasPhone("999999999").build();
    }

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