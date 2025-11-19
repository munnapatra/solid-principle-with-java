package com.mkp.solid_principle.ocp.solution;

public class CreditCardPayment implements PaymentStrategy {
	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment.");
	}
}