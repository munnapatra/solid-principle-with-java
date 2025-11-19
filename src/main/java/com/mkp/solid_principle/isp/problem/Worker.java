package com.mkp.solid_principle.isp.problem;

// Interface Segregation Principle (ISP):
//Clients should not be forced to depend on interface members they do not use.

//Robot don't eat but here Robot class is forcefully implementing eat method.
interface Worker {
	void work();

	void eat();
}

class Human implements Worker {
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

	public void eat() {
		throw new UnsupportedOperationException("Robots don't eat.");
	}
}