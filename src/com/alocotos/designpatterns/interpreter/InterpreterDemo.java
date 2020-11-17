package com.alocotos.designpatterns.interpreter;

public class InterpreterDemo {
	
	//Begin to define our rules of interpretation
	static Expression buildInterpreterTree() {
		
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");
		
		//More complex Expressions
		Expression alternation1 = new AndExpression(terminal2, terminal3);
		
		Expression alternation2 = new OrExpression(terminal1, alternation1);
		
		//We're not just using a bunch of If/Then-s and Switches
		return new AndExpression(terminal3, alternation2);
	}

	public static void main(String[] args) {
		
		//String context = "Lions";
		//String context = "Tigers";
		//String context = "Bears";
		//String context = "Lions Tigers";
		//String context = "Lions Bears";
		String context = "Tigers Bears";
		
		Expression define = buildInterpreterTree();
		
		//Run the context string through the rules engine to find if it is true or false
		System.out.println(context + " is " + define.interpret(context));

	}

}
