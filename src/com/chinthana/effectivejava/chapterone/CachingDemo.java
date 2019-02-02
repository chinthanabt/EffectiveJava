package com.chinthana.effectivejava.chapterone;

public class CachingDemo {
	
	public static void main (String ...arg) {
		
		PhoneNumber p1 = PhoneNumber.of(111);
		PhoneNumber p2 = PhoneNumber.of(111);
		
		//Hash codes should be equal.
		System.out.println("p1.hashCode-" + p1.hashCode());
		System.out.println("p2.hashCode-" + p2.hashCode());
	}
	
	
}
