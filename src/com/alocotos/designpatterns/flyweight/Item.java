package com.alocotos.designpatterns.flyweight;

class Item {
	
	//Everything in our Flyweight Item is immutable.
	private final String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	public String toSteing() {
		return name;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}
	
	

}
