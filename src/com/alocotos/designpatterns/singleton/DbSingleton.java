package com.alocotos.designpatterns.singleton;

public class DbSingleton {
	
	private static DbSingleton instance = null;
	
	//Prevents people from accessing or creating new instances. Purpose is to only have one.
	private DbSingleton() {
		
	}
	
	public static DbSingleton getInstance() {
		return instance;
	}

}
