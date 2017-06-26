package com.Producer.Consumer;

import com.concurrency.BlockingQueue.BlockingQueue;

public class ProducerConsumerExample {

	public static void main(String[] args) {
		
		BlockingQueue<String> queue = new BlockingQueue<String>(5);
		
		MyProducer prod = new ProducerConsumerExample().new MyProducer("PROD", queue);
		
		MyConsumer cons = new ProducerConsumerExample().new MyConsumer("CONS", queue);
		
		prod.start();
		cons.start();

	}
	
	
	
	class MyProducer extends Thread{
		
		BlockingQueue<String> queue;
		
		public MyProducer(String name, BlockingQueue<String> queue){
			super(name);
			this.queue = queue; 
		}
		
		public void run(){
			
			for(int i= 0; i<10 ; i++){
				try {
					queue.put(String.valueOf(i));
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}
	}
	
	
	
class MyConsumer extends Thread{
		
		BlockingQueue<String> queue;
		
		public MyConsumer(String name, BlockingQueue<String> queue){
			super(name);
			this.queue = queue; 
		}
		
		public void run(){
			
			try {
				while(true){
					System.out.println(Thread.currentThread().getName() +" - "+queue.get());
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
