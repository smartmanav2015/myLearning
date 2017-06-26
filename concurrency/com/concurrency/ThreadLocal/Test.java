package com.concurrency.ThreadLocal;

public class Test {

	public static void main(String[] args) {
		
		CounterTwo obj = new CounterTwo();
		RunnableTest t1 = new RunnableTest(obj);
		RunnableTest t2 = new RunnableTest(obj);
		RunnableTest t3 = new RunnableTest(obj);
		RunnableTest t4 = new RunnableTest(obj);
		RunnableTest t5 = new RunnableTest(obj);
		
		t1.start();	
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
	


}
