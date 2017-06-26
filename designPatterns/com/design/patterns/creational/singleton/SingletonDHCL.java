package com.design.patterns.creational.singleton;

public class SingletonDHCL {

    private volatile static SingletonDHCL instance;

    private SingletonDHCL() {
        // preventing Singleton object instantiation from outside
    }


    /*
     * 3rd version : An implementation of double checked locking of Singleton.
     * Intention is to minimize cost of synchronization and improve performance, by only locking critical section of code, code which creates instance of Singleton class.
     * By the way this is still broken, if we don't make _instance volatile, as another thread can see a half initialized instance of Singleton.
     */

    public static SingletonDHCL getInstanceDC() {
        if (instance == null) {
            synchronized (SingletonDHCL.class) {
                if (instance == null) {
                    instance = new SingletonDHCL();
                }
            }
        }
        return instance;
    }
}



