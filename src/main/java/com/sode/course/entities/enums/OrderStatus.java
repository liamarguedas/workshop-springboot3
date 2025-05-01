package com.sode.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELLED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {

		for (OrderStatus os : OrderStatus.values()) {

			if (os.getCode() == code) {
				return os;
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code");

	}
}
