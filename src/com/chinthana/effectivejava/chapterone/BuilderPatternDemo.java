package com.chinthana.effectivejava.chapterone;

public class BuilderPatternDemo {

	public static void main(String... arg) {
		// Using Builder Pattern, its more easy and readable.
		Person p1 = new Person.PersonBuilder().setfName("Chinthana").setlName("Thennakoon").buid();
		System.out.println(p1);
	}

}
