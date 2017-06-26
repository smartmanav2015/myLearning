package com.Thread.Sequence;

import java.util.concurrent.CyclicBarrier;

public class Test {

	public static void main(String args[]) {

		RunnableThree three = new RunnableThree();
		CyclicBarrier bar2 = new CyclicBarrier(1, three);

		RunnableTwo two = new RunnableTwo(bar2);
		CyclicBarrier bar1 = new CyclicBarrier(1, two);
		
		RunnableOne one = new RunnableOne(bar1);

		Thread t = new Thread(one);
		t.start();
	}
}