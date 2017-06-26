package com.concurrency.Runnable;


class GracefullyStopThread extends Thread {

	private volatile boolean stop = false;
	private int counter = 0;

	public void run() {
			while (!stop && counter < 5000) {
				System.out.println("COUNTER : "+counter++);
				System.out.println(Thread.currentThread().getName());
			}

			counter = 0;
			System.out.println("#######");
			if (stop) {
				System.out.println("Detected stop");
				System.out.println(Thread.currentThread().getName());
			}
	}

	public void requestStop() {
		stop = true;
	}
}

public class StopThread {

	public static void main(String[] args) throws InterruptedException {

		final GracefullyStopThread stoppableThread = new GracefullyStopThread();
		stoppableThread.start();
		//stoppableThread.start();
		Thread.sleep(3);
		stoppableThread.requestStop();
		System.out.println(Thread.currentThread().getName());
	}
}
