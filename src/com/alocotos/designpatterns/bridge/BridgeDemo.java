package com.alocotos.designpatterns.bridge;

public class BridgeDemo {
	
	public static void main(String[] args) {
		Movie movie = new Movie("Drama", "Green Mile", "2:45", "1999");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		
		String printerMaterial = moviePrinter.print(printFormatter);
		
		System.out.println(printerMaterial);
		
		//All we did was create another new Formatter, and use the same Movie and Printer, but printed with an HTML formatter instead
		Formatter htmlFormatter = new HtmlFormatter();
		
		String htmlMaterial = moviePrinter.print(htmlFormatter);
		
		System.out.println(htmlMaterial);
		
		//If we wanted to create a new type of Printer for a new type of Media we could make a Book Printer and a Book, then use one of the given Formatters or make a new one.
		//Printer bookPrinter = new BookPrinter(book);
		
	}

}
