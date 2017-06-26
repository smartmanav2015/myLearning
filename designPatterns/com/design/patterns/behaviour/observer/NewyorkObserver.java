package com.design.patterns.behaviour.observer;

public class NewyorkObserver extends Observer {

	public NewyorkObserver(Stock subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Newyork Price: " + Integer.toOctalString(subject.getState()));

	}
}
