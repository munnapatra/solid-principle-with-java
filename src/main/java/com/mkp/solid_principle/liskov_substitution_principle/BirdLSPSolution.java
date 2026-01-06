package com.mkp.solid_principle.liskov_substitution_principle;

//Liskov Substitution Principle (LSP): Derived classes must be completely substitutable for their base classes.
interface Flyable {
	void fly();
}

class Bird {
	public void eat() {
		System.out.println("Eating...");
	}
}

class Sparrow extends Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("Sparrow flying...");
	}
}

class Penguin extends Bird {

}

public class BirdLSPSolution {
	public static void main(String[] args) {
		Flyable fSparrow = new Sparrow();
		Bird bSparrow = new Sparrow();
		Bird penguin = new Penguin();
		fSparrow.fly();
		bSparrow.eat();
		penguin.eat();
	}
}