package com.concurrency.ThreadLocal;

public class RunnableTest extends Thread{
	
	CounterTwo obj ;
	
	public RunnableTest (CounterTwo obj){
		this.obj = obj;
		
	}

	@Override
	public void run() {
		for(int i = 0; i<5; i++){
			obj.incrementCount();
		}
		System.out.println(obj.getCount());
		
	}
	
}
