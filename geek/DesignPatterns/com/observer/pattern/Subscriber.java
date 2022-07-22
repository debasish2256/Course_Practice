package com.observer.pattern;

public class Subscriber implements Observer {

	private String name;
	private Channel channel = new Channel();

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hi "+name+", Video Uploaded with title "+channel.getTitle());
	}

	@Override
	public void subscibeChannel(Channel ch) {
		channel = ch;
	}
}
