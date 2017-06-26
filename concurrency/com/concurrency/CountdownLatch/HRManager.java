package com.concurrency.CountdownLatch;

import java.util.concurrent.CountDownLatch;

public class HRManager {

	public static void main(String args[]) {
		
		CountDownLatch countDownLatch = new CountDownLatch(3);

		Employee emp1 = new Employee(countDownLatch, "TL");
		Employee emp2 = new Employee(countDownLatch, "SD");
		Employee emp3 = new Employee(countDownLatch, "SE");

		emp1.start();
		emp2.start();
		emp3.start();

		try {
			System.out.println("HR Manager waiting for recruitment to complete...");
			countDownLatch.await();
			System.out.println("Distribute Offer Letter");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
