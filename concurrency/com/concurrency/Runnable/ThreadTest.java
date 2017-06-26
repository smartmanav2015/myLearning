package com.concurrency.Runnable;


class RunnableThread implements Runnable {
	
	@Override
	public void run(){
		System.out.println("MyThread run called");
		
		try{		
			for (int i = 0; i <= 5; i++) {
				System.out.println(i);
			}
			int i = 5/0;
			throw new Exception();
		}catch(Exception e){
			System.out.println("anshul");
			 Thread t = Thread.currentThread();
			// t.setDefaultUncaughtExceptionHandler(null);
			 t.setUncaughtExceptionHandler(new MyExceptionHandler());
			 t.getUncaughtExceptionHandler().uncaughtException(t, e);
		}		
		//throw new NullPointerException();
	}
}

public class ThreadTest {

	public static void main(String args[]) {
		
		RunnableThread runnableThread = new RunnableThread();
		Thread thread = new Thread(runnableThread);
		try {
			thread.start();
		} catch (Exception e) {
			System.out.println("caught inside main()");
			e.printStackTrace();
		}
		System.out.println("Runnable thread started");
	}
}
