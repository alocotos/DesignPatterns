package com.alocotos.designpatterns.flyweight;

public class FlyweightDemo {
	
	public static void main(String[] args) {
		
		InventorySystem invs = new InventorySystem();
		
		//We are intentionally adding the same three items over and over to our catalog.
		//The InventorySystem adds each item when taking the order, but only vreates a new item if it doesn't already exists.
		invs.takeOrder("Roomba", 221);
		invs.takeOrder("Bose Headphones", 361);
		invs.takeOrder("Samsung TV", 432);
		invs.takeOrder("Roomba", 563);
		invs.takeOrder("Bose Headphones", 321);
		invs.takeOrder("Samsung TV", 323);
		invs.takeOrder("Roomba", 234);
		invs.takeOrder("Bose Headphones", 365);
		invs.takeOrder("Samsung TV", 54);
		invs.takeOrder("Roomba", 34);
		invs.takeOrder("Roomba", 456);
		invs.takeOrder("Samsung TV", 332);
		
		invs.process();
		
		//We created a method to just show how many total items are created even though we ordered 12.
		System.out.println(invs.report());
	}

}
