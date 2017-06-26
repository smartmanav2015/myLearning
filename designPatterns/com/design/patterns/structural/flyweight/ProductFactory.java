package com.design.patterns.structural.flyweight;

import java.util.HashMap;

public class ProductFactory {
   private static final HashMap<Long, Product> prodMap = new HashMap<Long, Product>();
   

   public static Product getProduct(long prodId, long amount) {
      Product prod = (Product)prodMap.get(prodId);

      if(prod == null) {
    	  prod = new InvestmentProduct(amount);
    	  prodMap.put(prodId, prod);
         System.out.println("Creating Product of "+amount );
      }
      return prod;
   }
}
