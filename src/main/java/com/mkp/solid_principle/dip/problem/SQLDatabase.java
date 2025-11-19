package com.mkp.solid_principle.dip.problem;

//Dependency Inversion Principle (DIP): 
//High-level modules should not depend on low-level modules. Both should depend on abstractions

//Let say later we want to change to NoSQL database, you'd have to modify the Application class itself,
//breaking the flexibility and re-usability of the code.
class SQLDatabase {
	public void connect() {
		System.out.println("Connecting to SQL database...");
	}
}

class Application {
	private SQLDatabase db;

	public Application() {
		this.db = new SQLDatabase();
	}

	public void performDatabaseOperation() {
		db.connect();
	}
}