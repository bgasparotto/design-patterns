package com.bgasparotto.designpatterns.builder;

import java.util.Set;

public class CustomerBuilderImpl implements CustomerBuilder {
    private Customer customer;

    public CustomerBuilderImpl(String name) {
        this.customer = new Customer(name);
    }

    @Override
    public CustomerBuilder fromCity(String cityName) {
        customer.setCity(cityName);
        return this;
    }

    @Override
    public CustomerBuilder hasPhone(String phoneNumber) {
        Phone phone = new Phone(phoneNumber);

        Set<Phone> phones = customer.getPhones();
        phones.add(phone);
        return this;
    }

    @Override
    public Customer build() {
        return customer;
    }
}