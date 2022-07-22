package com.prototype.pattern;

/*Prototype pattern refers to creating duplicate object 
while keeping performance in mind.
This pattern involves implementing a prototype interface 
which tells to create a clone of the current object. 
This pattern is used when creation of object directly is 
costly. For example, an object is to be created after a 
costly database operation. We can cache the object, returns
its clone on next request and update the database as and 
when needed thus reducing database calls.*/


public class Prototype {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs=new BookShop();
		bs.setShopName("Oracle");
		bs.loadData();
		System.out.println(bs);
		
		//Shallow Copy
//		BookShop bs1=(BookShop) bs.clone();
		
		//Deep Copy
		BookShop bs1= bs.clone();
		
		bs.getBooks().remove(3);
		
		bs1.setShopName("A1");

		System.out.println(bs);
		System.out.println(bs1);

	}
}
