package com.chinthana.effectivejava.chapterone;

public class BuilderPatternDemo {

	public static void main(String... arg) {
		
		// Using Builder Pattern, the client code is more easy and readable.		
		Person p2 = new Person.Builder().setfName("Chintnana").setlName("Thennakoon").build();	
		System.out.println(p2);
	}

}
