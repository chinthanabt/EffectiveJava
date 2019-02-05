package com.chinthana.effectivejava.chapterone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAttackDemo {
	
	public static void main(String[] args) throws Exception {
		serialize();
		deserialize();	
		deserialize();
	}

	private static void serialize() throws IOException, FileNotFoundException {		
		//Create Singleton instance here
		Singleton instance1 = Singleton.INSTANCE;		
		//File is to write byte stream.
		String filename = " serializedFile.ser";		
		// Serialization
		// Saving of object in a file
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));

		// Write to outputStream
		out.writeObject(instance1);
		out.close();
		
		System.out.println("Object has been serialized");
		System.out.println("instance1 hashcode:- " + instance1.hashCode());
	}

	private static void deserialize() throws Exception {
		String filename = " serializedFile.ser";
		// De-serialization
		// Reading the object from a file
		ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream(filename));

		// Method for de-serialization of object
		Singleton instance2 = (Singleton) objInStream.readObject();
		objInStream.close();
		System.out.println("Object has been deserialized");	
		System.out.println("instance2 hashcode:- " + instance2.hashCode());
		
	}

}