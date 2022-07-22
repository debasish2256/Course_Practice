package com.observer.pattern;

public interface Subjects {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubsribers();

	void upload(String title);

}