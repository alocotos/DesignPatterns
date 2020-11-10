package com.alocotos.designpatterns.singleton;

public class DbSingleton {
	
	//Volatile keyword
	private static volatile DbSingleton instance = null;
	
	//Prevents people from accessing or creating new instances. Purpose is to only have one.
	private DbSingleton() {
		if(instance != null) {
			//Protects us from re-instantiation or reflection.
			throw new RuntimeException("Use get instance method to create singleton.");
		}
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			//Needs to be thread safe.
			synchronized(DbSingleton.class) {
				if(instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}

}
