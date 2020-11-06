package com.alocotos.designpatterns.bridge;

public class Movie {
	
	private String classification;
	private String runtime;
	private String title;
	private String year;
	
	public Movie(String classification, String title, String year, String runtime) {
		this.classification = classification;
		this.runtime = runtime;
		this.title = title;
		this.year = year;
	}

	public String getClassification() {
		return classification;
	}

	public String getRuntime() {
		return runtime;
	}

	public String getTitle() {
		return title;
	}

	public String getYear() {
		return year;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [classification=" + classification + ", runtime=" + runtime + ", title=" + title + ", year="
				+ year + "]";
	}
}
