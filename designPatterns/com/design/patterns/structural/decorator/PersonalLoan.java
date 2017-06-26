package com.design.patterns.structural.decorator;

public class PersonalLoan implements Loan {

	

	@Override
	public void calculateEMI() {
		System.out.println("Personal Loan EMI");
		
	}
	}
