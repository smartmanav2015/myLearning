package com.design.patterns.behaviour.observer;

public class LondonObserver extends Observer{

	   public LondonObserver(Stock subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	

	@Override
	public void update() {
		System.out.println( "London Price: " + Integer.toOctalString( subject.getState() ) );
		
	}
	}
