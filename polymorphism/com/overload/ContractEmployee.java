package com.overload;

public class ContractEmployee extends Employee {

	public void addEmployee(Integer sal, Integer id){
		System.out.println("child1");
	}
	
	public void addEmployee(Integer id, String name ){
		System.out.println("child2");
	}
	
    public void addEmployee(String name, Integer id){
		
		System.out.println("parent");
		
	}
}
