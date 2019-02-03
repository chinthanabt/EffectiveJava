package com.chinthana.effectivejava.chapterone;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public  class ReflectionAttackDemo {
	public static void main(String[] args) throws Exception {
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = null;
		
		//Call private constructor and create new instance using Reflections
		Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			if (Modifier.isPrivate(constructor.getModifiers())) {
				constructor.setAccessible(true);
				instance2 = (Singleton) constructor.newInstance();
			}
		}		
		System.out.println("instance1 - hashcode:- " + instance1.hashCode());
		System.out.println("instance2 - hashcode:- " + instance2.hashCode());
	}

}