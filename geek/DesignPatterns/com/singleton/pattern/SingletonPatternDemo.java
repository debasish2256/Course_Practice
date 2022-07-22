package com.singleton.pattern;


/*This pattern involves a single class which is 
responsible to create an object while making sure 
that only single object gets created. */

public class SingletonPatternDemo {

	public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	   }
	
}
