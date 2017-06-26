package com.concurrency.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Employee extends Thread {

	 CyclicBarrier cyclicBarrier;

	 public Employee(CyclicBarrier cyclicBarrier, String name) {
	  super(name);
	  this.cyclicBarrier = cyclicBarrier;

	 }

	 @Override
	 public void run() {

	  try {
	   Thread.sleep(3000);
	   System.out.println(Thread.currentThread().getName() + " recruited developer");
	   System.out.println(Thread.currentThread().getName() + " waiting for others to complete....");
	   cyclicBarrier.await();
	   System.out.println("All finished recruiting, " + Thread.currentThread().getName()+ " gives offer letter to candidate");

	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 }
	}
