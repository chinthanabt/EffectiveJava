package com.chinthana.effectivejava.chapterone;

public class Test {
	
	public static void main(String ...arg) {
		int i = 3;
		int a = i++; // a = 3, i = 4
		int b = ++a; // b = 4, a = 4
		
		System.out.println(i);
		System.out.println(a);
		System.out.println(b);
		
	}	
}
