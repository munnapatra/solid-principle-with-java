package com.mkp.solid_principle.lsp.problem;

//Liskov Substitution Principle (LSP): Derived classes must be completely substitutable for their base classes.
public class LSPTest {
	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		Bird penguin = new Penguin();
		sparrow.fly();
		penguin.fly(); // This will throw an exception at runtime! and which breaks the principle
	}
}
