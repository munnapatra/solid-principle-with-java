package com.mkp.solid_principle.dependency_Inversion_principle;

public class ApplicationDISolution {
	private Database db;

	public ApplicationDISolution(Database db) {
		this.db = db;
	}

	public void performDatabaseOperation() {
		db.connect();
	}
}

interface Database {
	void connect();
}

class SQLDatabase implements Database {
	public void connect() {
		System.out.println("Connecting to SQL database...");
	}
}

class MongoDBDatabase implements Database {
	public void connect() {
		System.out.println("Connecting to MongoDB database...");
	}
}