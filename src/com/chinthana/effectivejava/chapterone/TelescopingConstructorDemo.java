package com.chinthana.effectivejava.chapterone;

public class TelescopingConstructorDemo {
	
	public static void main (String ...arg) {
		//Traditional way 
		Phone p1 = new Phone("Apple", "8", 0, null, 0, null, null);
		
		System.out.println("p1 - " + p1);
		
		//Using Telescoping Constructor
		Phone p2 = new Phone("Apple", "8");
		
		System.out.println("p2 - " + p2);
	}

}
