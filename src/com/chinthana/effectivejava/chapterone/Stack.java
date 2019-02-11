package com.chinthana.effectivejava.chapterone;

import java.util.Arrays;

public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 10;

	private Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public static Stack create() {
		return new Stack();
	}	
	
	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	/**
	 * Pop the elements from the Stack
	 * 
	 * @return corresponding value
	 * @throws Exception
	 */
	public Object pop() throws Exception {
		if (size == 0)
			throw new Exception("Empty Stack");
		
		// memory leak with obsolete reference.
		 return elements[--size];

		// fix memory leak
		//Object result = elements[--stackPointer];		
		//elements[stackPointer] = null;
		//return result;
		 
	}

	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
}
