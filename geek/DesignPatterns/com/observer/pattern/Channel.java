package com.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subjects {
	private List<Subscriber> subs = new ArrayList<>();
	private String title;

	@Override
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

	@Override
	public void unSubscribe(Observer sub) {
		subs.remove(sub);
	}
	
	@Override
	public void notifySubsribers() {
		for(Observer sub:subs) {
			sub.update();
		}
	}
	
	@Override
	public void upload(String title) {
		this.setTitle(title);
		notifySubsribers();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
