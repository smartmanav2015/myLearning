package com.inner.Anonymous;

public class ThreadExample {

	public static void main(String[] args) {

		ThreadExample ex = new ThreadExample();
		ex.t.start();

	}

	Thread t = new Thread(new Runnable() {

		@Override
		public void run() {
			int i = 0;

			while (i < 10) {
				i++;
				System.out.println("running "+i);
			}
			System.out.println("done");
		}
	});

}
