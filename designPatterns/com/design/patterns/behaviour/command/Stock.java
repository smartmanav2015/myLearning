package com.design.patterns.behaviour.command;

public class Stock {
	
	   private String symbol ;
	   private int quantity;
	   
	   

	 public Stock(String symbol, int quantity) {
		super();
		this.symbol = symbol;
		this.quantity = quantity;
	}
	public void buy(){
	      System.out.println("Stock [ Name: "+symbol+", Quantity: " + quantity +" ] bought");
	   }
	   public void sell(){
	      System.out.println("Stock [ Name: "+symbol+", Quantity: " + quantity +" ] sold");
	   }
	}
