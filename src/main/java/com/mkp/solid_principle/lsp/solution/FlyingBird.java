package com.mkp.solid_principle.lsp.solution;

public class FlyingBird implements Bird {

	@Override
	public void eat() {
		System.out.println("Eating...");

	}

	public void fly() {
		System.out.println("Flying...");
	}

}
