package com.alocotos.designpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	
	protected List<Page> pages = new ArrayList<>();
	
	public Website() {
		this.createWebsite();
	}

	public List<Page> getPages() {
		return pages;
	}
	
	//Actual factory method.
	public abstract void createWebsite();

}
