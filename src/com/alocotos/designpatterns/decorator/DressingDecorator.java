package com.alocotos.designpatterns.decorator;

public class DressingDecorator extends SandwhichDecorator {
	
	public DressingDecorator(Sandwhich customSandwhich) {
		super(customSandwhich);
	}
	
	public String make() {
		return customSandwhich.make() + addDressing();
	}
	
	private String addDressing() {
		return " + Mustard";
	}

}
