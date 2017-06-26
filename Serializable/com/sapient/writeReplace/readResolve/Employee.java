package com.sapient.writeReplace.readResolve;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fName;
	
	private String lName;
	
	private long salary;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(String fName, String lName, long salary) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}
	
	private Object writeReplace(){
		Employee e1 = new Employee("abhinav", "sharma", 200);
		return e1;
		
	}
	
/*	private Object readResolve(){
		return new Employee("varun", "chawla", 300);
		
	}*/

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", salary="+ salary + "]";
	}
	
	
	

}
