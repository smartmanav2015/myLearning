package com.polymorphism.override;

import com.polymorphism.Payment;

public class Test implements Employee, XEmployee {

	public static void main(String[] args) {
		
		Employee e = new Test();
		XEmployee e1 = new Test();
		e.getSalary();
		e1.getSalary();
		

	}

	@Override
	public Payment getSalary() {
		System.out.println("IMPL ");
		return null;
	}

}
