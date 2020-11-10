package com.alocotos.designpatterns.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		
		//Able to call the static inner class from anywhere.
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		//We can switch, mix and match, or remove at all without needing niche constructors. 
		builder.bread("Wheat").condiments("Cheese").dressing("Mayo").meat("Turkey");
		
		//Create the actual order using the Builders build method.
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
	}

}
