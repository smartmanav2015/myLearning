package com.sapient.generic;

public class Employee {
	
	public Employee(String name){
		this.fName = name;
	}
	
	private String fName;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + "]";
	}
	
	

}
