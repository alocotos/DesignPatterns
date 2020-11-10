package com.alocotos.designpatterns.factorymethod;

public class WebsiteFactory {

	//Static method to be accessed anywhere.
	public static Website getWebsite(WebsiteType siteType) {
		switch (siteType) {
			case BLOG: {
				return new Blog();
			}
			
			case SHOP: {
				return new Shop();
			}
			
			default: {
				return null;
			}
		}
	}

}
