package com.chinthana.effectivejava.chapterone;

public class StaticControlFalw {
	
	//Static block
	static {
		//Call print method
		print();
	}
	
	//Main method
	public static void main(String ...arg) {	
		//System.out.println(x);
		//System.out.println(st);
	}
	
	//static method
	static void print() {
		System.out.println(x);
		System.out.println(st);
	}
	
	//static int variable
	static int x = 20;
	
	//static string method
	static String st = "StaticStr";
}

