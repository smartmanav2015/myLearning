package com.design.patterns.structural.proxy;

public class RealTransaction implements Transaction {

	private String operation;

	public RealTransaction(String operation) {
		this.operation = operation;
		getResourceReady(operation);
	}

	
	private void getResourceReady(String operation) {
		System.out.println("Getting ready for OPERATION " + operation);
	}

	@Override
	public void doTransaction() {
		System.out.println("TRANSACTION - PROCESSING");

	}
}
