package com.concurrency.CountdownLatch;

import java.util.concurrent.CountDownLatch;

public class Employee extends Thread {

	CountDownLatch countDownLatch;

	public Employee(CountDownLatch countDownLatch, String name) {
		super(name);
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " : recruited");
		countDownLatch.countDown();
		System.out.println("DISTRIBUTE NOW");
	}

}
