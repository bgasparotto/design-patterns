package com.bgasparotto.designpatterns.builder;

/**
 * Entity that represents a {@code Phone} of the system.
 * 
 * @author Bruno Gasparotto
 *
 */
public class Phone {
	private long id;
	private String number;

	/**
	 * <p>
	 * Constructor.
	 * </p>
	 *
	 * @param id
	 *            The phone's {@code id}
	 * @param number
	 *            The phone's {@code number}
	 */
	public Phone(long id, String number) {
		this.id = id;
		this.number = number;
	}

	/**
	 * <p>
	 * Constructor.
	 * </p>
	 *
	 * @param number
	 *            The phone's {@code number}
	 */
	public Phone(String number) {
		this(0, number);
	}

	/**
	 * Gets the {@code Phone}'s {@code id}.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Gets the {@code Phone}'s {@code number}.
	 *
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the {@code Phone}'s {@code id}.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Sets the {@code Phone}'s {@code number}.
	 *
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[id=");
		builder.append(id);
		builder.append(", number=");
		builder.append(number);
		builder.append("]");
		return builder.toString();
	}
}