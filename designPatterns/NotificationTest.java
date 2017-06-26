 import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java program to demonstrate How to use notify and notifyAll method in Java and
 * How notify and notifyAll method notifies thread, which thread gets woke up etc.
 */
public class NotificationTest {

    private volatile boolean go = false;

    public static void main(String args[]) throws InterruptedException {
        
     
        RunnablePRO producer = new RunnablePRO();
     
        RunnableCON consumer = new RunnableCON();
     
        Thread t1 = new Thread(producer, "WT1"); //will wait
        Thread t2 = new Thread(producer, "WT2"); //will wait
        Thread t3 = new Thread(producer, "WT3"); //will wait
        Thread t4 = new Thread(consumer,"NT1"); //will notify
     
        //starting all waiting thread
        t1.start();
        t2.start();
        t3.start();
     
        //pause to ensure all waiting thread started successfully
        Thread.sleep(200);
     
        //starting notifying thread
        t4.start();
     
    }
    /*
     * wait and notify can only be called from synchronized method or bock
     */
    synchronized void shouldGo() throws InterruptedException {
        while(go != true){
            System.out.println(Thread.currentThread() + " is going to wait on this object");
            wait(); //release lock and reacquires on wakeup
            System.out.println(Thread.currentThread() + " is woken up");
        }
        go = false; //resetting condition
    }
 
    /*
     * both shouldGo() and go() are locked on current object referenced by "this" keyword
     */
    synchronized void go() {
        while (go == false){
            System.out.println(Thread.currentThread() + " is going to notify all or one thread waiting on this object");

            go = true; //making condition true for waiting thread
            //notify(); // only one out of three waiting thread WT1, WT2,WT3 will woke up
            notifyAll(); // all waiting thread  WT1, WT2,WT3 will woke up
        }
     
    }
 
}