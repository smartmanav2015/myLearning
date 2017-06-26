package com.Thread.Sequence;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RunnableTwo implements Runnable {
	CyclicBarrier cb;

	RunnableTwo(CyclicBarrier cb) {
		this.cb = cb;
	}

	public void run() {

		System.out.println("Second Runnable Executed");
		try {
			cb.await();
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (BrokenBarrierException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
