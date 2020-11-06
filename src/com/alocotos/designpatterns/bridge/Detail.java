package com.alocotos.designpatterns.bridge;

public class Detail {
	
	private String lable;
	private String value;
	
	public Detail(String lable, String value) {
		super();
		this.lable = lable;
		this.value = value;
	}
	
	public String getLable() {
		return lable;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setLable(String lable) {
		this.lable = lable;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Detail [lable=" + lable + ", value=" + value + "]";
	}
}
