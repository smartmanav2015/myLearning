package com.concurrency.Executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


public class FutureTaskTest{
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		//FutureTaskImplementation futureTaskImplementation = new FutureTaskImplementation();
		
		PerformStringReversal perf = new PerformStringReversal();
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		MyCallable c1 = new MyCallable("aakash", perf);
		MyCallable c2 = new MyCallable("saxena", perf);
		
		List<Callable> list = new ArrayList<Callable>();
		list.add(c1);
		list.add(c2);
		
		FutureTask<String> f = new FutureTask<String>(c1);
		FutureTask<String> f2 = new FutureTask<String>(c2);
		
		 pool.submit(f);
		 pool.submit(f2);
		 
		 //pool.invokeAll((Collection<? extends Callable<String>>) list);
		
		while(!f.isDone()){
			Thread.sleep(1500);
			System.out.println("still working");
		}

		System.out.println("complete  "+ f.get());
		System.out.println("complete  "+ f2.get());
		

	
	}

}
