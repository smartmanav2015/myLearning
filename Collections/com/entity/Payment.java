package com.entity;

import java.util.HashSet;

public class Payment {//implements Comparable<Payment> {
	
	private long id;
	
	private String bank;

	private long amount;
	
	

	public Payment(long id, String bank, long amount) {
		super();
		this.id = id;
		this.bank = bank;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	/*@Override
	public int compareTo(Payment o) {
		// TODO Auto-generated method stub
		return (int) (this.getAmount() - o.getAmount());
	}*/
	
	
	public static void main(String args[]){
		HashSet<Payment> set = new HashSet<Payment>();
	}
	
	
	
	

}
