package com.mkp.solid_principle.interface_segregation_principle;

// Interface Segregation Principle (ISP):
//Clients should not be forced to depend on interface members they do not use.

//Robot don't eat but here Robot class is forcefully implementing eat method.
interface WorkerISProblem {
	void work();

	void eat();
}

class HumanIS implements WorkerISProblem {
	public void work() {
		System.out.println("Human is working.");
	}

	public void eat() {
		System.out.println("Human is eating.");
	}
}

class RobotIS implements WorkerISProblem {
	public void work() {
		System.out.println("Robot is working.");
	}

	public void eat() {
		throw new UnsupportedOperationException("Robots don't eat.");
	}
}