package com.concurrency.ThreadLocal;

public class NormalTest {

	public static void main(String[] args) {
		
		NormalCounter obj = new NormalCounter();
		NormalRunableTest t1 = new NormalRunableTest(obj);
		NormalRunableTest t2 = new NormalRunableTest(obj);
		NormalRunableTest t3 = new NormalRunableTest(obj);
		NormalRunableTest t4 = new NormalRunableTest(obj);
		NormalRunableTest t5 = new NormalRunableTest(obj);
		
		t1.start();	
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
