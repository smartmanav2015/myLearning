package com.concurrency.Callable;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {
	
	String name ;
	

	public CallableThread(String name) {
		super();
		this.name = name;
	}



	@Override
	public String call() throws Exception {
		
		for(int i=0;i<500;i++){
			System.out.println("inside Call method --> "+i+" "+name);	
		}
		//throw new NullPointerException();

		return "finished";
	}

}