package com.chinthana.effectivejava.chapterone;

public class SingletonDemo {
	
	public static void main (String ...args) {		
		Singleton ob1 = Singleton.INSTANCE;
		Singleton ob2 = Singleton.getInstance();
		
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());		
	}
	
}


