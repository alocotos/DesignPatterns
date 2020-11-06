package com.alocotos.designpatterns.adapter;

public class LegacyEmployee {
	
	private String empCode;
	private String givenName;
	private String surname;
	private String address;
	
	public LegacyEmployee(String empCode, String givenName, String surname, String address) {
		this.empCode = empCode;
		this.givenName = givenName;
		this.surname = surname;
		this.address = address;
	}

	public String getEmpCode() {
		return empCode;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getSurname() {
		return surname;
	}

	public String getAddress() {
		return address;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "LegacyEmployee [empCode=" + empCode + ", givenName=" + givenName + ", surname=" + surname
				+ ", address=" + address + "]";
	}
}
