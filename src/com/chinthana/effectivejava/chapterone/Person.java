package com.chinthana.effectivejava.chapterone;

class Person {
	private final String fName;
	private final String lName;
	private final String description;
	private final int age;
	private final String skingColor;
	private final String hairColor;
	private final int height;
	private final int weight;	

	public static class PersonBuilder {
		private String fName;
		private String lName;
		private String description;
		private int age;
		private String skingColor;
		private String hairColor;
		private int height;
		private int weight;
	
		public PersonBuilder setfName(String fName) {
			this.fName = fName;
			return this;
		}
	
		public PersonBuilder setlName(String lName) {
			this.lName = lName;
			return this;
		}
	
		public PersonBuilder setDescription(String description) {
			this.description = description;
			return this;
		}
	
		public PersonBuilder setAge(int age) {
			this.age = age;
			return this;
		}
	
		public PersonBuilder setSkingColor(String skingColor) {
			this.skingColor = skingColor;
			return this;
		}
	
		public PersonBuilder setHairColor(String hairColor) {
			this.hairColor = hairColor;
			return this;
		}
	
		public PersonBuilder setHeight(int height) {
			this.height = height;
			return this;
		}
	
		public PersonBuilder setWeight(int weight) {
			this.weight = weight;
			return this;
		}
		
		//Build the person here
		public Person buid() {
			return new Person(this);
		}
	
	}
	
	Person(PersonBuilder builder) {	
		this.fName = builder.fName;
		this.lName = builder.lName;
		this.description = builder. description;
		this.age = builder.age;
		this.skingColor = builder.skingColor;
		this.hairColor = builder.hairColor;
		this.height = builder.height;
		this.weight = builder.weight;
	}
	
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", description=" + description + ", age=" + age
				+ ", skingColor=" + skingColor + ", hairColor=" + hairColor + ", height=" + height + ", weight="
				+ weight + "]";
	}

}