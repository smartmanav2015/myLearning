package com.concurrency.ThreadLocal;


/*
 * Thread Safe implementation of Account
 * Each Thread will get its own instance of balance which will not be shared between other threads. *
 */
public class Counter {

    private static final ThreadLocal<Long> count = new ThreadLocal<Long>() {

        /*
         * initialValue() is called
         */
        @Override
        protected Long initialValue() {
            System.out.println("Setting COUNT for Thread with value 5 : " + Thread.currentThread().getName());
            return 5L;
        }
    };

    /*
     * Every time there is a call for balance, ThreadLocal will return calling Thread's copy of balance
     */
    public static Long getThreadLocalValue() {
        return count.get();
    }
    
    public static void setThreadLocalValue(int num) {
         count.set(getThreadLocalValue()*num);
    }
    
    
    
}
