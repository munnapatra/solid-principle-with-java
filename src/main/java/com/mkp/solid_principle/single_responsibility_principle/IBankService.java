package com.mkp.solid_principle.single_responsibility_principle;

// reason to change on transactions only
public interface IBankService {
	void deposit(double amount);

	double withdraw(double amount);
}
