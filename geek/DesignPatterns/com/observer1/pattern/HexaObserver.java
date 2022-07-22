package com.observer1.pattern;

public class HexaObserver implements Observer {

	private Subject subject;

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}
}