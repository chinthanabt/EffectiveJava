package com.chinthana.effectivejava.chapterone;

import java.io.Serializable;

public class Singleton implements Serializable {
	public static final long serialVersionUID = 1L;
	//Initializing the static singleton instance here.
	static final Singleton INSTANCE = new Singleton();	
	
	//Private constructor to prevent additional objects creation
	private Singleton() {
		System.out.println("Private constructor called");		
	}

	//Static factory method to get the singleton instance
	public static Singleton getInstance() {	
		return INSTANCE;		
	}

}

//if(INSTANCE != null) {
//throw new InstantiationError( "Cannot reflectively create enum objects" );
//}


////Implement readResolve method to prevent Reflection, Serialization and Cloning
//protected Object readResolve() 
//{ 
//  return INSTANCE; 
//}
