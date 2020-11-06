package com.alocotos.designpatterns.composite;

public class CompositeDemo {

	public static void main(String[] args) {
		
		Menu mainMenu = new Menu("Main", "/main");
		
		MenuItem safetyMenuItem = new MenuItem("Saftey", "/safety");
		
		mainMenu.add(safetyMenuItem);
		
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		
		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claims", "/personalClaims");
		
		claimsSubMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());

	}

}
