package com.design.patterns.structural.decorator;

/**
 * Decorator pattern allows to add new functionality an existing object without
 * altering its structure
 * 
 * @author Akki
 * 
 */
public class DecoratorPatternDemo {
	   public static void main(String[] args) {

	      Loan pLoan = new PersonalLoan();
	      Loan hLoan = new HomeLoan();
	      
	      Loan pLoanVat = new LoanDecorator(pLoan);
	      Loan hLoanVat = new LoanDecorator(hLoan);

	      System.out.println("EMI of PLoan -- > ");
	      pLoan.calculateEMI();

	      System.out.println("EMI of HLoan -- > ");
	      hLoan.calculateEMI();
	      

	      System.out.println("Additional Interest on HomeLoan");
	      hLoanVat.calculateEMI();
	      
	   }
	}
