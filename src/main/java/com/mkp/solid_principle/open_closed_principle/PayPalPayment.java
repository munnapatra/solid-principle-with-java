package com.mkp.solid_principle.open_closed_principle;

public class PayPalPayment implements PaymentStrategy {
	@Override
	public void processPayment() {
		System.out.println("Processing PayPal payment.");
	}
}