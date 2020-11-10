package com.alocotos.designpatterns.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Java Design Patterns");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
		
		
		/*
		 * OUTPUT:
		 * com.alocotos.designpatterns.prototype.Movie@5305068a
		 * 2:13
		 * Java Design Patterns
		 * null
		 * com.alocotos.designpatterns.prototype.Movie@1f32e575
		 * 2:13
		 * Gang of Four
		 * null
		 * 
		 * The idea behind the output is that we can set up some default information
		 * but also manipulate individual fields. We also aren't using the 'new' keyword
		 * for light weight object instantiation.
		 * 
		 */

	}

}
