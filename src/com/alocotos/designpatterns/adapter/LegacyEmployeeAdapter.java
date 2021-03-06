package com.alocotos.designpatterns.adapter;

public class LegacyEmployeeAdapter implements Employee {
	
	private LegacyEmployee legacyEmployee;
	
	public LegacyEmployeeAdapter(LegacyEmployee legacyEmployee) {
		this.legacyEmployee = legacyEmployee;
	}

	@Override
	public String getId() {
		//Maps the correct field in LegacyEmployee to Employee. Different field names are no issue.
		return legacyEmployee.getEmpCode();
	}

	@Override
	public String getFirstName() {
		return legacyEmployee.getGivenName();
	}

	@Override
	public String getLastName() {
		return legacyEmployee.getSurname();
	}

	@Override
	public String getEmail() {
		return legacyEmployee.getAddress();
	}

	@Override
	public String toString() {
		return "LegacyEmployeeAdapter [legacyEmployee=" + legacyEmployee + "]";
	}

}
