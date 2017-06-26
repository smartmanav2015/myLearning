package com.concurrency.ThreadLocal;

import java.io.IOException;


public class RunnableTask implements Runnable{
	   
    @Override
    public void run() {
    	System.out.println("Thread: "+Thread.currentThread().getName()+" count is : "+RunnableTask.getCount());
        for(int i=1; i<4; i++){
        	RunnableTask.setCount(i);
            System.out.println("Thread: "+Thread.currentThread().getName()+" count is : "+RunnableTask.getCount());        	
        }      
    }
    
    /*
     * Thread safe format method because every thread will use its own DateFormat
     */
    public static Long getCount(){
        Long count = Counter.getThreadLocalValue();
        return count;
    }
    
    public static void setCount(int num){        
    	Counter.setThreadLocalValue(num);
    }
    
    public static void main(String args[]) throws IOException {
        Thread t1 = new Thread(new RunnableTask());  
        Thread t2 = new Thread( new RunnableTask());     
        t1.start();
        t2.start();      
     
    }
    
    
}
