package com.chinthana.effectivejava.chapterone;

public class CachingDemo {

	public static void main(String... arg) {
		
		//Objects create using constructor
		PhoneNumber p1 = new PhoneNumber(11, 11, 1111111);
		PhoneNumber p2 = new PhoneNumber(11, 11, 1111111);				
		
		// Hash codes will not equal. its obvious!
		System.out.println("p1.hashCode-" + p1.hashCode());
		System.out.println("p2.hashCode-" + p2.hashCode());
		
		//Call static factory method to create objects instead of constructor.
		PhoneNumber p3 = PhoneNumber.of(11, 11, 1111111);
		PhoneNumber p4 = PhoneNumber.of(11, 11, 1111111);

		// Hash codes should be equal.
		System.out.println("p3.hashCode-" + p3.hashCode());
		System.out.println("p4.hashCode-" + p4.hashCode());
	}

}



//PhoneNumber p6 = PhoneNumber.of(94, 11, 1111111);
//
//if(p6 instanceof SriLankanPhoneNumber) {
//	System.out.println("its a srilankan number");
//}