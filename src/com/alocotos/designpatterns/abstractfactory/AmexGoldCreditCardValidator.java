package com.alocotos.designpatterns.abstractfactory;

public class AmexGoldCreditCardValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}
