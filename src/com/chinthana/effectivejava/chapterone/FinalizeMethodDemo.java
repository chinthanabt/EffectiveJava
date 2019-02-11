package com.chinthana.effectivejava.chapterone;

public class FinalizeMethodDemo {
	
	public static void main(String ...arg) {
		
		FinalizeMethodDemo ob1 = new FinalizeMethodDemo();
		//ob1 = null;
		System.gc();
		
	}
	
	@Override
	protected void finalize() throws Throwable {		
		System.out.println("finalize method called");
	}

}
