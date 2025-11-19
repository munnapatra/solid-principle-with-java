package com.mkp.solid_principle.lsp.solution;

interface Flyable {
	void fly();
}

class BirdC {
	public void eat() {
		System.out.println("Eating...");
	}
}

class SparrowC extends BirdC implements Flyable {
	@Override
	public void fly() {
		System.out.println("Sparrow flying...");
	}
}

class Penguin extends BirdC {

}

public class TestApp {
	public static void main(String[] args) {
		Flyable sparrow = new SparrowC();
		BirdC penguin = new Penguin();
		sparrow.fly();
		penguin.eat();
	}
}