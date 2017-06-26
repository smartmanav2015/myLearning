package com.concurrency.CompletionService;

import java.util.logging.Logger;

public class PerformStringReversal {

	

	/** This method will allow to perform string reversal in a slow manner */
	public String reverseString(String strOriginalWord) {

		StringBuffer reversedString = new StringBuffer();

		long start = System.nanoTime();

		for (int counter = (strOriginalWord.length() - 1); counter >= 0; counter--) {

			reversedString.append(strOriginalWord.charAt(counter));

			System.out.println("REVERSING : "+ reversedString.toString().toUpperCase());
			System.out.println("THREAD : "+ Thread.currentThread());

		

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
		}
		
		System.out.println("TOTAL CONSUMED TIME: " + (System.nanoTime() - start)/ 1000000 + "ms");
		return reversedString.toString().toUpperCase();
	}
}