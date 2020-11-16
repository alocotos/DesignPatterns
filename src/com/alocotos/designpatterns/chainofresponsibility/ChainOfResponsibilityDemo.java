package com.alocotos.designpatterns.chainofresponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		
		Director andy = new Director();
		VP matt = new VP();
		CEO mike = new CEO();
		
		andy.setSuccessor(matt);
		matt.setSuccessor(mike);
		
		//First concrete handler andy, can handle conferences.
		Request request = new Request(RequestType.CONFERENCE, 500);
		andy.handleRequest(request);
		
		//Once the request is no longer handle-able by andy, the request is passed
		//to it's successor matt, established in line 11.
		request = new Request(RequestType.PURCHASE, 1000);
		andy.handleRequest(request);
		
		//Once handlers andy and matt can no longer handle a requets it passed to 
		//matt's successor, mike; established in line 12.
		request = new Request(RequestType.PURCHASE, 5000);
		andy.handleRequest(request);

	}

}
