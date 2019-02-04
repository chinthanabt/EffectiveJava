package com.chinthana.effectivejava.chapterone;

public class BuilderPatternDemo {

	public static void main(String... arg) {
		// Using Builder Pattern, the client code is more easy and readable.
		Person p1 = new Person.PersonBuilder().setfName("Chinthana").setlName("Thennakoon").build();
		System.out.println(p1);
	}

}
