package com.alocotos.designpatterns.singleton;

public class DbSingletonDdemo {

	public static void main(String[] args) {
		
		DbSingleton instance = DbSingleton.getInstance();
		
		System.out.println(instance);

		//This is to show we get the same address both times, which shows it's the same object.
		DbSingleton instance2 = DbSingleton.getInstance();
		
		System.out.println(instance2);
		

	}

}
