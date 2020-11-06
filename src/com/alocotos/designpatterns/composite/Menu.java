package com.alocotos.designpatterns.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}
	
	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(print(this));
		
		//Recursively iterate through Menus because each component knows it's children.
		Iterator<MenuComponent> itr = menuComponents.iterator();
		while(itr.hasNext()) {
			MenuComponent menuComponent = itr.next();
			sb.append(menuComponent.toString());
		}
		
		return sb.toString();
	}

}
