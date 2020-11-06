package com.alocotos.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();
	
	public MenuComponent add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level.");
	}
	
	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level.");
	}
	
	String print(MenuComponent menuComponent) {
		StringBuilder sb = new StringBuilder(name);
		sb.append(": ");
		sb.append(url);
		sb.append("\n");
		return sb.toString();
	}
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return url;
	}
	
	public abstract String toString();

}
