package com.mkp.solid_principle.dependency_Inversion_principle;

//Dependency Inversion Principle (DIP): 
//High-level modules should not depend on low-level modules. Both should depend on abstractions

//Let say later we want to change to NoSQL database, you'd have to modify the Application class itself,
//breaking the flexibility and re-usability of the code.
class SQLDatabaseDIProblem {
	public void connect() {
		System.out.println("Connecting to SQL database...");
	}
}

class ApplicationDI {
	private SQLDatabaseDIProblem db;

	public ApplicationDI() {
		this.db = new SQLDatabaseDIProblem();
	}

	public void performDatabaseOperation() {
		db.connect();
	}
}