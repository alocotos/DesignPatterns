package com.alocotos.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

//This class acts as a factory and a cache for Item Flyweight Objects.
public class Catalog {
	
	private Map<String, Item> items = new HashMap<String, Item>();
	
	//Factory method.
	public Item lookup(String itemName) {
		if(!items.containsKey(itemName))
			items.put(itemName, new Item(itemName));
		return items.get(itemName);
	}
	
	public int totalItemsMade() {
		return items.size();
	}

}
