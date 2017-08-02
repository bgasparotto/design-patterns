package com.bgasparotto.designpatterns.nullobject;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * Checkout class simulating a client class that searches for discounts.
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
public class CheckOut {
	private BigDecimal cartValue;
	private Discount discount;

	/**
	 * <p>
	 * Constructor.
	 * </p>
	 * 
	 * @param cartValue
	 *            The cart total value before the checkout
	 */
	public CheckOut(BigDecimal cartValue) {
		this.cartValue = cartValue;
	}

	/**
	 * Does the checkout considering the current {@code cartValue} and apply any
	 * discounts available.
	 */
	public void doCheckOut() {
		DiscountService discountService = new DiscountService();
		discount = discountService.findDiscount(LocalDateTime.now());

		// Null checks no more
		BigDecimal discountValue = discount.getValue();
		cartValue = cartValue.subtract(discountValue);
		
		System.out.println("The discount value is " + discountValue);
		System.out.println("Final cart value is " + cartValue);
	}

	/**
	 * Invokes the checkout printing the result to the console.
	 * 
	 * @param args
	 *            args
	 */
	public static void main(String[] args) {
		CheckOut checkOut = new CheckOut(new BigDecimal(1000));
		checkOut.doCheckOut();
	}
}