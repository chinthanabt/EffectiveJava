package com.chinthana.effectivejava.chapterone;

public class CachingDemo {

	public static void main(String... arg) {
		
		//
		PhoneNumber p1 = new PhoneNumber(111);
		PhoneNumber p2 = new PhoneNumber(111);
		
		// Hash codes will not equal. its obvious!
		System.out.println("p1.hashCode-" + p1.hashCode());
		System.out.println("p2.hashCode-" + p2.hashCode());
		
		//Call static factory method instead of constructor.
		PhoneNumber p3 = PhoneNumber.of(111);
		PhoneNumber p4 = PhoneNumber.of(111);

		// Hash codes should be equal.
		System.out.println("p3.hashCode-" + p3.hashCode());
		System.out.println("p4.hashCode-" + p4.hashCode());
	}

}
