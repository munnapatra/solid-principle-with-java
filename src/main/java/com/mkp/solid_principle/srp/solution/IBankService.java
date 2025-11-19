package com.mkp.solid_principle.srp.solution;

// reason to change on transactions only
public interface IBankService {
	void deposit(double amount);

	double withdraw(double amount);
}
