package com.journaldev.threads.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

	public static void main(String[] args) {
		Resource r = new Resource();
		ReentrantLock lock = new ReentrantLock();
		ConcurrencyLockExample c1 = new ConcurrencyLockExample(r,lock);
		ConcurrencyLockExample c2 = new ConcurrencyLockExample(r,lock);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		

	}

}
