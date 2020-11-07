package com.alocotos.designpatterns.flyweight;

public class Order {
	
	private final int orderNumber;
	private final Item item;
	
	Order(int orderNumber, Item item){
		this.orderNumber = orderNumber;
		this.item = item;
	}
	
	void processOrder() {
		System.out.println("Odering: " + item + " for order number: " + orderNumber);
	}

}
