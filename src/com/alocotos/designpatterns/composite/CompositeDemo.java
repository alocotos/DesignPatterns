package com.alocotos.designpatterns.composite;

public class CompositeDemo {

	public static void main(String[] args) {
		
		//Composite is a tree structure where each Object is a component that is treated the same as the whole.
		//Every Object knows it child.
		Menu mainMenu = new Menu("Main", "/main");
		
		MenuItem safetyMenuItem = new MenuItem("Saftey", "/safety");
		
		//We are able to add Menus or MenuItems to Menus to create a tree with leaves, but all Components have the same functionality.
		//We could make it so leaves have additional functionality, without altering the root of the tree since Children are AT LEAST 100% of their parents.
		mainMenu.add(safetyMenuItem);
		
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		
		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claims", "/personalClaims");
		
		claimsSubMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());

	}

}
