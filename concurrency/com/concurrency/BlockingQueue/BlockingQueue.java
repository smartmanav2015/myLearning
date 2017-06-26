package com.concurrency.BlockingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {

    private Queue<T> q = new LinkedList<T>();
    private int limit;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public synchronized void put (T t) throws InterruptedException {
        while (q.size() == limit) {
            wait();
        }
        q.add(t);
        notifyAll();
    }


    public synchronized T get () throws InterruptedException {
        while (q.size() == 0) {
            wait();
        }

        T t = q.poll();
        notifyAll();
        return t;
    }

 
}
