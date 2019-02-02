package com.chinthana.effectivejava.chapterone;

//Java code for serialization and deserialization
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class SerializationDemo implements Serializable {	
	private static final long serialVersionUID = 1L;
	public transient static final SerializationDemo INSTANCE = new SerializationDemo();

	private SerializationDemo() {
		//(INSTANCE != null) throw new AssertionError();
		System.out.println("Private constructor called");
	}
}

class Demo {
	public static void main(String[] args) throws Exception {
		SerializationDemo instance1 = SerializationDemo.INSTANCE;
		SerializationDemo test2 = null;

		Constructor<?>[] constructors = SerializationDemo.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			if (Modifier.isPrivate(constructor.getModifiers())) {
				constructor.setAccessible(true);
				test2 = (SerializationDemo) constructor.newInstance();
			}
		}

		System.out.println("Hash codes:- " + test2.hashCode() + "," + instance1.hashCode());

		String filename = "file.ser";
		// Serialization
		// Saving of object in a file
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));

		// Method for serialization of object
		out.writeObject(instance1);
		out.close();

		System.out.println("Object has been serialized");

		// De-serialization
		// Reading the object from a file
		ObjectInputStream out2 = new ObjectInputStream(new FileInputStream(filename));

		// Method for de-serialization of object
		SerializationDemo instance2 = (SerializationDemo) out2.readObject();
		out2.close();
		System.out.println("Object has been deserialized");
		System.out.println("instance1 code:- " + instance1.hashCode());
		System.out.println("instance2 code:- " + instance2.hashCode());

		// De-serialization
		// Reading the object from a file
		ObjectInputStream out3 = new ObjectInputStream(new FileInputStream(filename));

		// Method for de-serialization of object
		SerializationDemo instance3 = (SerializationDemo) out3.readObject();
		out3.close();
		System.out.println("Object has been deserialized");
		System.out.println("instance1 code:- " + instance1.hashCode());
		System.out.println("instance2 code:- " + instance2.hashCode());
		System.out.println("instance3 code:- " + instance3.hashCode());
	}

}