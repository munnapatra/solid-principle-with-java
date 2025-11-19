package com.mkp.solid_principle.srp.problem;

//Single Responsibility Principle (SRP): A class should have only one reason to change.

public interface IBankService {
	// deposit and withdraw is belongs to transactions
	void deposit(double amount);
	double withdraw(double amount);

	// Here notification it can be a mail notification or message notification
	// so here reason to change can be on transactions or notification which is breaking the SRP
	void sendNotification();
}