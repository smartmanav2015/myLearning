package com.design.patterns.structural.flyweight;

public class InvestmentProduct implements Product {

	float roi;

	float investmentAmount;

	@Override
	public void updateDM() {
		System.out.println("The ROI is : " + roi + " and AMOUNT is : "+ investmentAmount);
	}

	public float getRoi() {
		return roi;
	}

	public void setRoi(float roi) {
		this.roi = roi;
	}

	public float getInvestmentAmount() {
		return investmentAmount;
	}

	public void setInvestmentAmount(float investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public InvestmentProduct(float roi, float investmentAmount) {
		super();
		this.roi = roi;
		this.investmentAmount = investmentAmount;
	}

	public InvestmentProduct(long amount) {
		this.investmentAmount = amount;
	}
	
	
	
	

}