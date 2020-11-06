package com.alocotos.designpatterns.decorator;

public abstract class SandwhichDecorator implements Sandwhich {
	
	protected Sandwhich customSandwhich;
	
	public SandwhichDecorator(Sandwhich customSandwhich) {
		this.customSandwhich = customSandwhich;
	}
	
	public String make() {
		return customSandwhich.make();
	}

}
