package com.bgasparotto.designpatterns.nullobject;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity that represents a {@code Discount} of the system.
 * 
 * @author Bruno Gasparotto
 *
 */
public class Discount {
	private BigDecimal value;
	private LocalDateTime date;

	/**
	 * Gets the {@code Discount}'s {@code value}.
	 *
	 * @return the value
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * Gets the {@code Discount}'s {@code date}.
	 *
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * Sets the {@code Discount}'s {@code value}.
	 *
	 * @param id
	 *            the value to set
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	/**
	 * Sets the {@code Discount}'s {@code date}.
	 *
	 * @param id
	 *            the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[value=");
		builder.append(value);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
}