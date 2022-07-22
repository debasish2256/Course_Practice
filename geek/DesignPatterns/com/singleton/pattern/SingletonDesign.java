package com.singleton.pattern;

/*creational design patterns
	only one instance of the class should exist
	other classes should be able to get instance of Singleton class
	Used in Logging,caching,Session, Drivrs*/


/*RULES
	constructors should be private
	public method for returning instance
	instance type: private static*/

/*Initialization Type:
	Eager Intialization
	Lazy Intilization
	Thread Safe Method Initialization
	Thread Safe Block Initialisation*/

class SingletonEager{
	private static SingletonEager instance=new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getnstance() {
		return instance;
	}
	
}

class Singleton{
	private static Singleton instance;
	private Singleton() {}
	public static Singleton getInstance() {
		if(instance ==null) {
			instance=new Singleton();
		}
		return instance;
	}
}

class SingletonSynchronized {
	private static SingletonSynchronized instance;

	private SingletonSynchronized() {
	}

	public static synchronized SingletonSynchronized getInstance() {
		if (instance == null) {
			synchronized (SingletonSynchronized.class) {
				if (instance == null) {
					instance = new SingletonSynchronized();
				}
			}
		}
		return instance;
	}
}


public class SingletonDesign {
	
	public static void main(String[] args) {
		/*
		 * SingletonEager se=SingletonEager.getnstance(); System.out.println(se);
		 * SingletonEager se1=SingletonEager.getnstance(); System.out.println(se1);
		 */
		
		SingletonSynchronized ins=SingletonSynchronized.getInstance();
		System.out.println(ins);
		SingletonSynchronized ins2=SingletonSynchronized.getInstance();
		System.out.println(ins2);
		
	}
}
