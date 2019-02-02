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

	public Person(String fName, String lName, String description, int age, String skingColor, String hairColor,
			int height, int weight) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.description = description;
		this.age = age;
		this.skingColor = skingColor;
		this.hairColor = hairColor;
		this.height = height;
		this.weight = weight;
	}

	public static class PersonBuider {
		private String fName;
		private String lName;
		private String description;
		private int age;
		private String skingColor;
		private String hairColor;
		private int height;
		private int weight;

		public PersonBuider setfName(String fName) {
			this.fName = fName;
			return this;
		}

		public PersonBuider setlName(String lName) {
			this.lName = lName;
			return this;
		}

		public PersonBuider setDescription(String description) {
			this.description = description;
			return this;
		}

		public PersonBuider setAge(int age) {
			this.age = age;
			return this;
		}

		public PersonBuider setSkingColor(String skingColor) {
			this.skingColor = skingColor;
			return this;
		}

		public PersonBuider setHairColor(String hairColor) {
			this.hairColor = hairColor;
			return this;
		}

		public PersonBuider setHeight(int height) {
			this.height = height;
			return this;
		}

		public PersonBuider setWeight(int weight) {
			this.weight = weight;
			return this;
		}

		// Build the person here
		public Person buid() {
			return new Person(fName, lName, description, age, skingColor, hairColor, height, weight);
		}
	}

	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", description=" + description + ", age=" + age
				+ ", skingColor=" + skingColor + ", hairColor=" + hairColor + ", height=" + height + ", weight="
				+ weight + "]";
	}

}
