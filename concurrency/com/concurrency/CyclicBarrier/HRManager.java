package com.concurrency.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class HRManager {

	public static void main(String args[]) {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

		Employee emp1 = new Employee(cyclicBarrier, "TL");
		Employee emp2 = new Employee(cyclicBarrier, "SD");
		Employee emp3 = new Employee(cyclicBarrier, "SE");

		emp1.start();
		emp2.start();
		emp3.start();

		System.out.println("No work for HR manager");

	}

}
