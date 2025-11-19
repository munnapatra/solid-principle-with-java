package com.mkp.solid_principle.dip.solution;

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

class Application {
	private Database db;

	public Application(Database db) {
		this.db = db;
	}

	public void performDatabaseOperation() {
		db.connect();
	}
}