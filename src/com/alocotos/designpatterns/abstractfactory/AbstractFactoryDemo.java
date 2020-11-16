package com.alocotos.designpatterns.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		//All we need is a credit Score, and a Type of card. We don't need to know what's going on under the hood.
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		
		//The correct factory is returned, and the concrete card type is returned based on this score.
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card2.getClass());
		
	}

}
