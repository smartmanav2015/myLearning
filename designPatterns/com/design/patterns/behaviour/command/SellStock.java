package com.design.patterns.behaviour.command;

public class SellStock implements Order {
	   private Stock abcStock;

	   public SellStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void executeOrder() {
	      abcStock.sell();
	   }
	}
