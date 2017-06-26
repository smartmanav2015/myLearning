package com.concurrency.Runnable;
public class MyExceptionHandler implements Thread.UncaughtExceptionHandler {
	

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		
		System.out.println("Aakash's Handler");
		e.printStackTrace();
		
	}

}
