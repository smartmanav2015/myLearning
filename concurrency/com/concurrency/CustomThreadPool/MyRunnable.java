package com.concurrency.CustomThreadPool;


public class MyRunnable implements Runnable {

	private String str;
	private PerformStringReversal perf;
	
	public MyRunnable(String str, PerformStringReversal perf){
		this.str = str;
		this.perf = perf;
	}
	
	@Override
	public void run() {
		
		String retValue = perf.reverseString(str);
		
		System.out.println("RETURNED VALUE --> " +retValue);
	}

}
