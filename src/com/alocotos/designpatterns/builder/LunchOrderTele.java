package com.alocotos.designpatterns.builder;

public class LunchOrderTele {
	
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	//This is restricting as you must go in the give order
	//We could change the order, but that doesn't solve problem of what to do
	//if you don't want a specific ingredient. 
	public LunchOrderTele(String bread) {
		this.bread = bread;
	}
	
	public LunchOrderTele(String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}
	
	public LunchOrderTele(String bread, String condiments, String dressing) {
		this(bread, condiments);
		this.dressing = dressing;
	}
	
	public LunchOrderTele(String bread, String condiments, String dressing, String meat) {
		this(bread, condiments, dressing);
		this.meat = meat;
	}
	
	//Currently immutable, removed setters.
	public String getBread() {
		return bread;
	}
	
	public String getCondiments() {
		return condiments;
	}
	
	public String getDressing() {
		return dressing;
	}
	
	public String getMeat() {
		return meat;
	}
}
