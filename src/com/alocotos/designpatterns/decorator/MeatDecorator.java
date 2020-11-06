package com.alocotos.designpatterns.decorator;

public class MeatDecorator extends SandwhichDecorator {
	
	public MeatDecorator(Sandwhich customSandwhich) {
		super(customSandwhich);
	}
	
	public String make() {
		return customSandwhich.make() + addMeat();
	}
	
	private String addMeat() {
		return " + Turkey";
	}

}
