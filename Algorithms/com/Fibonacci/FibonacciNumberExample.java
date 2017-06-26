package com.Fibonacci;

public class FibonacciNumberExample {
	public static void main(String[] args) {
		int maxValue = 20;
		long[] seriesArray = new long[maxValue];
		seriesArray[0] = 0;
		seriesArray[1] = 1;
		// calculate the Fibonacci numbers and store them in array
		for (int i = 2; i < maxValue; i++) {
			seriesArray[i] = seriesArray[i - 1] + seriesArray[i - 2];
		}
		System.out.println("Fibonacci Series For " + maxValue);
		for (int i = 0; i < maxValue; i++) {
			System.out.print(seriesArray[i] + " ");
		}
	}
}


