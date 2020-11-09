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
		
		//We are able to add LegacyEmployees using the LegacyEmployeeAdapter 
		employees.add(new LegacyEmployeeAdapter(legacyEmployee));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("2,Andy,Smith,asmith@email.com");
		
		//Same for CSVEmployees, Any new or old type of Employee can be added by creating an Adapter for that Object
		employees.add(new EmployeeCSVAdapter(employeeFromCSV));
		
		return employees;
	}

}
