package com.mkp.solid_principle.open_closed_principle;

//Open/Closed Principle (OCP):  Entity should be open for extension, but closed for modification.

// Here we have this class to process payment, 
// initially it was implemented with CreditCard payment 
// later requirement come to implement the PayPal payment
// By modifying this processPayment method implementation has been done which breaks the OCP rule
public class PaymentProcessorOCProblem {

	public void processPayment(String paymentType) {
		if (paymentType.equals("CreditCard")) {
			processCreditCardPayment();
		} else if (paymentType.equals("PayPal")) {
			processPayPalPayment();
		}
	}

	private void processCreditCardPayment() {
		System.out.println("Processing credit card payment.");
	}

	private void processPayPalPayment() {
		System.out.println("Processing PayPal payment.");
	}
}