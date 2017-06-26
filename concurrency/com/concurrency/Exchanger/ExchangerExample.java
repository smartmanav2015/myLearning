package com.concurrency.Exchanger;

import java.util.concurrent.Exchanger;
 
public class ExchangerExample {  
 
   public static void main(String[] args) throws InterruptedException {
 
      Exchanger<String> exchanger = new Exchanger<String>();
 
      Thread t1 = new MyThread(exchanger, "I like coffee.");
      Thread t2 = new MyThread(exchanger, "I like tea");
      t1.start();
      Thread.sleep(9000);
      t2.start();
   }
}
 
class MyThread extends Thread {
 
   Exchanger<String> exchanger;
   String message;
 
   MyThread(Exchanger<String> exchanger, String message) {
      this.exchanger = exchanger;
      this.message = message;
   }
 
   public void run() {
      try {
         System.out.println(this.getName() + " message: " + message);
 
         // exchange messages
         message = exchanger.exchange(message);
 
         System.out.println(this.getName() + " message: " + message);
      } catch (Exception e) {
      }
   }
}