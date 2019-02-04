package com.chinthana.effectivejava.chapterone;

import java.io.Serializable;

public class Singleton implements Serializable {
	
	public transient String test = "Test";
	public static String test1 = null;

	public static final long serialVersionUID = 1L;
	
	//Initializing the static singleton instance here.
	public static final Singleton INSTANCE = new Singleton();
	

	//Private constructor to prevent additional objects creation
	private Singleton() {
//		if(INSTANCE != null) {
//			throw new InstantiationError( "Cannot reflectively create enum objects" );
//		}
		System.out.println("Private constructor called");
	}
	
	//Static factory method to get the singleton instance
	public static Singleton getInstance() {		
		return INSTANCE;		
	}
	
//	//Implement readResolve method to prevent Reflection, Serialization and Cloning
//    protected Object readResolve() 
//    { 
//        return INSTANCE; 
//    }

}
