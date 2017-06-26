package com.design.patterns.behaviour.observer;

public class HongKongObserver extends Observer{

	   public HongKongObserver(Stock subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	

	@Override
	public void update() {
		System.out.println( "HongKong Price: " + Integer.toOctalString( subject.getState() ) );
		
	}
	}
