package com.concurrency.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableThreadTest {

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		CallableThread callableThread = new CallableThread("test");
		FutureTask futureTask = new FutureTask(callableThread);
		futureTask.run();
		
		
		System.out.println("before FUTURE - GET");
		
		
		try {
			System.out.println(futureTask.get());
		} catch (NullPointerException e) {
			System.out.println("EXCEPTION ENCOUNTERED");
		}
		System.out.println("OVER - FUTURE RETURNED SUCCESS");
	}
}
