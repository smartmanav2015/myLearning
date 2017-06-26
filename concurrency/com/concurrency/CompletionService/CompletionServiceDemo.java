package com.concurrency.CompletionService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


public class CompletionServiceDemo{
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		
		
		PerformStringReversal perf = new PerformStringReversal();
		
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		MyCallable c1 = new MyCallable("aakash", perf);
		MyCallable c2 = new MyCallable("sax", perf);
		
		List<Callable> list = new ArrayList<Callable>();
		list.add(c1);
		list.add(c2);
		
		CompletionService<String> cs = new ExecutorCompletionService<String>(pool);
	
		cs.submit(c1);
		
		Thread.sleep(3000);
		//System.out.println("COMPLETED : ");
		
		Future<String> f = cs.take(); //()poll();
		System.out.println("COMPLETED : " +f.get());
		System.out.println("???");
		
		while(!f.isDone()){
			Thread.sleep(1500);
			System.out.println("still working");
		}
	
		System.out.println("COMPLETED : " +f.get());

	
	}

}
