package com.concurrency.ThreadLocal;


/*
 * Thread Safe implementation of Account
 * Each Thread will get its own instance of balance which will not be shared between other threads. *
 */
public class CounterTwo {

    private static final ThreadLocal<Long> count = new ThreadLocal<Long>() {

        /*
         * initialValue() is called
         */
        @Override
        protected Long initialValue() {
            System.out.println("Setting COUNT for Thread with value 5 : " + Thread.currentThread().getName());
            return 0L;
        }
    };
    
    public void incrementCount(){
    	count.set(count.get()+ 1L);
    }
    
    public Long getCount(){
    	return count.get();
    }

    
    
    
    
}
