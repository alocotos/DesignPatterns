package com.alocotos.designpatterns.factorymethod;

public class Shop extends Website {

	//You can see different in types of Pages used to create different types of Websites.
	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());

	}

}
