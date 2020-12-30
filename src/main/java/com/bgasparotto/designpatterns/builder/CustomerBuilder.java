package com.bgasparotto.designpatterns.builder;

/**
 * Contract for the {@code Builder} design pattern implementations for the {@link Customer} class.
 *
 * @see <a href= "http://bgasparotto.com/design-patterns/builder">bgasparotto - Builder</a>
 */
public interface CustomerBuilder {

    /**
     * Defines a {@code cityName} on the current instance being built
     */
    CustomerBuilder fromCity(String cityName);

    /**
     * Adds a {@code phoneNumber} on the current instance being built
     */
    CustomerBuilder hasPhone(String phoneNumber);

    /**
     * Builds and returns the instance.
     */
    Customer build();
}