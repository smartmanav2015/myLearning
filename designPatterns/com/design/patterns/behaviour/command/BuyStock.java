package com.design.patterns.behaviour.command;

public class BuyStock implements Order {
	   private Stock abcStock;

	   public BuyStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void executeOrder() {
	      abcStock.buy();
	   }
	}
