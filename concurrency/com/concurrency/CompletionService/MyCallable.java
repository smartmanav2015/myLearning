package com.concurrency.CompletionService;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	private String str;
	private PerformStringReversal perf;
	
	public MyCallable(String str, PerformStringReversal perf){
		this.str = str;
		this.perf = perf;
	}
	
	@Override
	public String call() throws Exception {
		
		String retValue = perf.reverseString(str);
		
		return retValue;
	}

}
