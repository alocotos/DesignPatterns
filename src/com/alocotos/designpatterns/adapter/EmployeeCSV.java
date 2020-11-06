package com.alocotos.designpatterns.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	public EmployeeCSV(String values) {
		StringTokenizer tokenizer = new StringTokenizer(values, ",");
		if(tokenizer.hasMoreElements()) {
			id = Integer.parseInt(tokenizer.nextToken());
		}
		
		if(tokenizer.hasMoreElements()) {
			firstName = tokenizer.nextToken();
		}
		
		if(tokenizer.hasMoreElements()) {
			lastName = tokenizer.nextToken();
		}
		
		if(tokenizer.hasMoreElements()) {
			email = tokenizer.nextToken();
		}
		
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeCSV [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
}
