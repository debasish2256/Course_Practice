package com.observer.pattern;

/*Observer pattern is used when there is one-to-many 
relationship between objects such as if one object is modified, 
its depenedent objects are to be notified automatically.*/

//Observer pattern falls under behavioral pattern category.



//Here all the subscribers are observers 

public class Youtube {
	public static void main(String[] args) {
		Channel hindi=new Channel();
		
		Subscriber s1=new Subscriber("Debasish");
		Subscriber s2=new Subscriber("Soham");
		Subscriber s3=new Subscriber("Harsh");
		Subscriber s4=new Subscriber("Kiran");
		Subscriber s5=new Subscriber("Pravin");
		
		//hindi know their subscribers
		hindi.subscribe(s1);
		hindi.subscribe(s2);
		hindi.subscribe(s3);
		hindi.subscribe(s4);
		hindi.subscribe(s5);

		hindi.unSubscribe(s2);
		
		//subsribers know which channel they subscribe
		s1.subscibeChannel(hindi);
		s2.subscibeChannel(hindi);
		s3.subscibeChannel(hindi);
		s4.subscibeChannel(hindi);
		s5.subscibeChannel(hindi);

		hindi.upload("New Journey Video");
	}
}
