package com.concurrency.ThreadLocal;

public class NormalRunableTest extends Thread{
	
	NormalCounter obj ;
	
	public NormalRunableTest (NormalCounter obj){
		this.obj = obj;
		
	}

	public NormalRunableTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for(int i = 0; i<5; i++){
			obj.incrementCount();
		}
		System.out.println(obj.getCount());
		
	}
	
}
