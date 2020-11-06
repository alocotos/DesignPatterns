package com.alocotos.designpatterns.adapter;

public class EmployeeCSVAdapter implements Employee {
	
	private EmployeeCSV employeeFromCSV;
	
	public EmployeeCSVAdapter(EmployeeCSV employeeFromCSV) {
		this.employeeFromCSV = employeeFromCSV;
	}

	@Override
	public String getId() {
		return employeeFromCSV.getId() + "";
	}

	@Override
	public String getFirstName() {
		return employeeFromCSV.getFirstName();
	}

	@Override
	public String getLastName() {
		return employeeFromCSV.getLastName();
	}

	@Override
	public String getEmail() {
		return employeeFromCSV.getEmail();
	}

	@Override
	public String toString() {
		return "EmployeeCSVAdapter [" + employeeFromCSV + "]";
	}
	
	

}
