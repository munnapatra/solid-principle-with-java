package com.mkp.solid_principle.ocp.solution;

// If we have to implement UPI payment process than we no need modify this class 
// we have to just create child class of PaymentStrategy as UPIPyament
public class PaymentProcessor {

	private PaymentStrategy paymentStrategy;

	public PaymentProcessor(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void process() {
		paymentStrategy.processPayment();
	}
}
