package com.lock.payment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Calculator {
	
    private int calculatedValue;
    private int value;
    
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock readLock = lock.readLock();
    private Lock writeLock = lock.writeLock();

    public void calculate(int value) {
        writeLock.lock();
        try {
            this.value = value;
            this.calculatedValue = doMySlowCalculation(value);
        } finally {
            writeLock.unlock();
        }
    }

    private int doMySlowCalculation(int value2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCalculatedValue() {
        readLock.lock();
        try {
            return calculatedValue;
        } finally {
            readLock.unlock();
        }
    }

    public int getValue() {
        lock.readLock().lock();
        try {
            return value;
        } finally {
            readLock.unlock();
        }
    }
}

