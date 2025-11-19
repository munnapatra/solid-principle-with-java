package com.mkp.solid_principle.lsp.problem;

//Liskov Substitution Principle (LSP): 
//Derived classes must be completely substitutable for their base classes.

// But here Penguin is derived from Bird but not Penguin not able to fly 
class Bird {
	public void eat() {
		System.out.println("Eating...");
	}

	public void fly() {
		System.out.println("Flying...");
	}
}

class Sparrow extends Bird {

}

class Penguin extends Bird {
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Penguins can't fly!");
	}
}