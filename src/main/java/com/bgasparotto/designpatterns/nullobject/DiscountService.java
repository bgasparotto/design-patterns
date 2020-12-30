package com.bgasparotto.designpatterns.nullobject;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Sample service that search for discounts and may or may not return null.
 */
public class DiscountService {

    public Discount findDiscount(LocalDateTime date) {
        Discount discount = findMockDiscount(date);

        Optional<Discount> optional = Optional.ofNullable(discount);
        return optional.orElse(new NullDiscount());
    }

    private Discount findMockDiscount(LocalDateTime date) {

        // Gets a random number and return null if it's even
        int random = ThreadLocalRandom.current().nextInt(0, 9 + 1);
        if (random % 2 == 0) {
            return null;
        }

        // Returns a valid discount object otherwise
        Discount discount = new Discount();
        discount.setValue(BigDecimal.TEN);
        discount.setDate(date);
        return discount;
    }
}