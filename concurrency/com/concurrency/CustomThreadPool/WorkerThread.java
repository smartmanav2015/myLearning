package com.concurrency.CustomThreadPool;

import java.util.LinkedList;

public class WorkerThread extends Thread {

	private final LinkedList<Runnable> taskQueue;
	private volatile boolean shouldStop = false;

	public WorkerThread(LinkedList<Runnable> taskQueue) {
		this.taskQueue = taskQueue;
	}

	public void run() {
		while (!shouldStop) {
			Runnable r;
			synchronized (taskQueue) {
				while (taskQueue.isEmpty()) {
					try {
						taskQueue.wait();
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
				r = taskQueue.removeFirst();
			}
			r.run();

		}
	}

	public void shouldStop() {
		this.shouldStop = true;
		this.interrupt();
	}
}
