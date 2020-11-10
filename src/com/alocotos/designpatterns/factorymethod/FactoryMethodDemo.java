package com.alocotos.designpatterns.factorymethod;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		
		//Use Enums to make things more stable.
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());

	}

}
