package com.mkp.solid_principle.liskov_substitution_principle;

//Liskov Substitution Principle (LSP): Derived classes must be completely substitutable for their base classes.

// But here Penguin is derived from Bird but Penguin not able to fly 
class BirdLSProblem {
	public void eat() {
		System.out.println("Eating...");
	}

	public void fly() {
		System.out.println("Flying...");
	}
}

class SparrowLS extends BirdLSProblem {

}

class PenguinLS extends BirdLSProblem {
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Penguins can't fly!");
	}
}