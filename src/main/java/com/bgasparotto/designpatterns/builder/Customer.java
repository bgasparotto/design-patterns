package com.bgasparotto.designpatterns.builder;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private long id;
    private String name;
    private String city;
    private Set<Phone> phones;

    public Customer(long id, String name, String city, Set<Phone> phones) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.phones = phones;
    }

    public Customer(String name, String city, Set<Phone> phones) {
        this(0, name, city, phones);
    }

    public Customer(String name) {
        this(0, name, null, new HashSet<>());
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

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