package com.alocotos.designpatterns.flyweight;

class Item {
	
	//Everything in our Flyweight Item is immutable.
	private final String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	

}
