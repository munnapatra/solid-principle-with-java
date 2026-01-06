package com.mkp.solid_principle.open_closed_principle;

public class CreditCardPayment implements PaymentStrategy {
	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment.");
	}
}