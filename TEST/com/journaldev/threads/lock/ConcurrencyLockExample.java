package com.journaldev.threads.lock;
 
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
 
public class ConcurrencyLockExample implements Runnable{
 
    private Resource resource;
    private Lock lock;
     
    public ConcurrencyLockExample(Resource r, ReentrantLock lock){
        this.resource = r;
        this.lock = lock;//new ReentrantLock();
    }
     
    @Override
    public void run() {
        try {
            if(lock.tryLock(10, TimeUnit.SECONDS)){
            resource.doSomething();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            //release lock
            lock.unlock();
        }
        resource.doLogging();
        System.out.println("DONE");
    }
 
}