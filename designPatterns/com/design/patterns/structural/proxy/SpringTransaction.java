package com.design.patterns.structural.proxy;

public class SpringTransaction implements Transaction {

	private RealTransaction real;
	private String operation;

	public SpringTransaction(String operation) {
		this.operation = operation;
	}

	/*
	 * @Override public void display() {
	 *  if(realImage == null){
	 *  	 realImage = new RealImage(fileName);
	 *   }
	 *   realImage.display(); }
	 */

	@Override
	public void doTransaction() {
		System.out.println("SPRING Transaction boundary - STARTED");
		if(real == null){
			real = new RealTransaction(operation);
		}
		real.doTransaction();
		System.out.println("SPRING Transaction boundary - END");

	}
}
