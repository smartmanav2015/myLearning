package com.concurrency.CustomThreadPool;

public class TestCustomeThreadPool {

	public static void main(String[] args) {
		
		CustomThreadPool pool = new CustomThreadPool(3);
		PerformStringReversal perf = new PerformStringReversal();
		pool.execute(new MyRunnable("aakash", perf));
		pool.execute(new MyRunnable("saxena", perf));
		pool.execute(new MyRunnable("dabbu", perf));

	}

}
