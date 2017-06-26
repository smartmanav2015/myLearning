package com.journaldev.threads.lock;
 
public class Resource {
 
    public void doSomething(){
        //do some operation, DB read, write etc
    	System.out.println(Thread.currentThread().getName());
    	try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
     
    public void doLogging(){
        //logging, no need for thread safety
    }
}