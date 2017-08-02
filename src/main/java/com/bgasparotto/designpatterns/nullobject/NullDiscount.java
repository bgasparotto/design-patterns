package com.bgasparotto.designpatterns.nullobject;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * Class which implements the {@code Null Object} design pattern for the
 * {@link Discount} class.
 * </p>
 * <p>
 * Any modification on the {@code Discount} class should be applied as well to
 * this class, in order to have a valid returning value for all
 * {@code Discount}'s declared methods.
 * </p>
 * 
 * @author Bruno Gasparotto
 * 
 * @see <a href=
 *      "http://bgasparotto.com/design-patterns/null-object">bgasparotto - Null
 *      Object</a>
 *
 */
public class NullDiscount extends Discount {

	@Override
	public BigDecimal getValue() {
		return BigDecimal.ZERO;
	}

	@Override
	public LocalDateTime getDate() {
		return LocalDateTime.now();
	}
}