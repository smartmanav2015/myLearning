package com.design.patterns.structural.decorator;

public class LoanDecorator implements Loan {
	  
	protected Loan loan;
	private float roi;

	   public LoanDecorator(Loan loan){
	      this.loan = loan;
	   }

	
	@Override
	public void calculateEMI() {
		loan.calculateEMI();
		getRoi();
	}

	public float getRoi() {
		return roi;
	}

	public void setRoi(float roi) {
		this.roi = roi;
	}
}
