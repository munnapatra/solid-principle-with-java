package com.mkp.solid_principle.ocp.solution;

public class PayPalPayment implements PaymentStrategy {
	@Override
	public void processPayment() {
		System.out.println("Processing PayPal payment.");
	}
}