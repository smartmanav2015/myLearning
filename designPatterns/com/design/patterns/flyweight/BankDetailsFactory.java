package com.design.patterns.flyweight;

import java.util.HashMap;

public class BankDetailsFactory {
   
	private static final HashMap<Long, BankDetails> bdMap = new HashMap();
   

   public static BankDetails getBankDetails(Long bankId) {
	   BankDetails details = (BankDetails)bdMap.get(bankId);

      if(details == null) {
         details = new BankDetails();
         bdMap.put(bankId, details);
         System.out.println("Getting Bank Details for BankId : " + bankId);
      }
      return details;
   }
}
