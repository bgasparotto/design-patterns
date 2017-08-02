package com.bgasparotto.designpatterns.nullobject;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

/**
 * <p>
 * Basic {@link DiscountService} implementation to search for discounts on
 * mocked resources for educational purposes.
 * </p>
 * 
 * @author Bruno Gasparotto
 *
 */
public class DiscountService {

	/**
	 * Find a discount for the given {@code date}.
	 * 
	 * @param date
	 *            The date of the desired discount
	 * @return The available discount of the given {@code date}
	 */
	public Discount findDiscount(LocalDateTime date) {
		
		// Goes to the mock database and checks for today's discounts.
		Discount discount = findMockDiscount(date);
		
		Optional<Discount> optional = Optional.ofNullable(discount);
		return optional.orElse(new NullDiscount());
	}

	/**
	 * Mock method that pretends going to the database but return valid and
	 * {@code null} discounts with 50 percent chance each.
	 * 
	 * @param date
	 *            The date to be searched for discounts
	 * @return The discount or {@code null} if there is no discount present
	 */
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