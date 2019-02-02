package com.chinthana.effectivejava.chapterone;

public class BuiderPatternDemo {
	
	public static void main (String ...arg) {
		//Traditional way 
		Person p1 = new Person("Chinthana", "Thennakoon", null, 0, null, null, 0, 0);	
		
		//Using Builder Pattern, its more easy and readable.
		Person p2 = new Person.PersonBuider().setfName("Chinthana").setlName("Thennakoon").buid();
	}

}

