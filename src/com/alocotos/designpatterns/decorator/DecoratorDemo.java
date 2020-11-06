package com.alocotos.designpatterns.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {

		Sandwhich sandwhich = new DressingDecorator(new MeatDecorator(new SimpleSandwhich()));
		
		System.out.println(sandwhich.make());

	}

}
