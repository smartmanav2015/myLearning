package com.Thread.Sequence;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RunnableOne implements Runnable {
	CyclicBarrier cb;

	RunnableOne(CyclicBarrier cb) {
		this.cb = cb;
	}

	public void run() {
		System.out.println("First Runnable Executed");
		try {
			Thread.sleep(1000);
			cb.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
