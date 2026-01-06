package com.mkp.solid_principle.interface_segregation_principle;

interface Worker {
	void work();
}

interface Eater {
	void eat();
}

class Human implements Worker, Eater {
	public void work() {
		System.out.println("Human is working.");
	}

	public void eat() {
		System.out.println("Human is eating.");
	}
}

class Robot implements Worker {
	public void work() {
		System.out.println("Robot is working.");
	}
}