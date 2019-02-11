package com.chinthana.effectivejava.chapterone;

public class StackDemo {
	
	public static void main(String... arg) throws Exception {
		//Creating the Stack
		Stack stack = Stack.create();
		
		//Push values to the stack
		stack.push(1);		
		stack.push(8);
		stack.push(3);
		
		//Pop values from the stack
		System.out.println(stack.pop());				
	}

}
