package com.design.patterns.behaviour.observer;

/**
 * 
 * Observer pattern is used when there is one to many relationship between
 * objects such as if one object is modified, its dependent objects are to be
 * notified automatically. Observer pattern falls under behavioral pattern
 * category.
 * 
 * @author Akki
 * 
 */
public class ObserverPatternDemo {
	   public static void main(String[] args) {
		   Stock subject = new Stock();

	      new LondonObserver(subject);
	      new HongKongObserver(subject);
	      new NewyorkObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	   }
	}
