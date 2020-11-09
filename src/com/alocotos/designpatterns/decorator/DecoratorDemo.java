package com.alocotos.designpatterns.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		
		//We can "daisy-chain" or wrap each class with another class to add to each Object.
		//All of the Decorators extend and take SimpleSandwhiches as an argument. 
		Sandwhich sandwhich = new DressingDecorator(new MeatDecorator(new SimpleSandwhich()));
		
		//This allows us to customize Objects on the fly, without altering the actual class.
		System.out.println(sandwhich.make());

	}

}
