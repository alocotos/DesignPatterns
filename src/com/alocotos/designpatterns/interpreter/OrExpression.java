package com.alocotos.designpatterns.interpreter;


//Non-terminal so we can compare things, or choose context.
public class OrExpression implements Expression {
	
	private Expression expr1 = null;
	private Expression expr2 = null;
	
	public OrExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) || expr2.interpret(context);
	}

}
