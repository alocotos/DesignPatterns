package com.alocotos.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<Employee> getEmployeeList() {
		 
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employeeFromDB = new EmployeeImpl("1","John","Smith","jsmith@email.com");
		
		employees.add(employeeFromDB);
		
		//Won't work without Adapter.
		//Employee employeeFromLegacy = new EmployeeFromLegacy("aabb11","Matt","Jenkins","mjenks@email.net");
		
		LegacyEmployee legacyEmployee = new LegacyEmployee("aabb11","Matt","Jenkins","mjenks@email.net");
		
		employees.add(new LegacyEmployeeAdapter(legacyEmployee));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("2,Andy,Smith,asmith@email.com");
		
		employees.add(new EmployeeCSVAdapter(employeeFromCSV));
		
		return employees;
	}

}
