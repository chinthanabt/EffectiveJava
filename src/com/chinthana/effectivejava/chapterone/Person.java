package com.chinthana.effectivejava.chapterone;

public class Person {
	private final String fName;
	private final String lName;
	private final String title;
	private final String designation;
	private final String passportNumber;
	private final int numberOfDependant;
		
	public static class Builder {
		private String fName;
		private String lName;
		private String title;
		private String designation;
		private String passportNumber;
		private int numberOfDependant;		
		
		public Builder setfName(final String fName) {
			this.fName = fName;
			return this;
		}
		
		public Builder setlName(final String lName) {
			this.lName = lName;
			return this;
		}
		
		public Builder setDesignation(final String designation) {
			this.designation = designation;
			return this;
		}
		
		public Builder setTitle(final String title) {
			this.title = title;
			return this;
		}
		
		public Builder setPassportNumber(final String passportNumber) {
			this.passportNumber = passportNumber;
			return this;
		}
		
		public Builder setNumberOfDependant(final int numberOfDependant) {
			this.numberOfDependant = numberOfDependant;
			return this;
		}		

		// Build the person here
		public Person build() {
			return new Person(this);
		}

	}

	private Person(Builder builder) {
		this.fName = builder.fName;
		this.lName = builder.lName;
		this.designation = builder.designation;
		this.title = builder.title;	
		this.passportNumber = builder.passportNumber;
		this.numberOfDependant = builder.numberOfDependant;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Person [fName=");
		stringBuilder.append(fName);
		stringBuilder.append(", lName=");
		stringBuilder.append(lName);
		stringBuilder.append(", title=");
		stringBuilder.append(title);
		stringBuilder.append(", designation=");
		stringBuilder.append(designation);
		stringBuilder.append(", passportNumber=");
		stringBuilder.append(passportNumber);
		stringBuilder.append(", numberOfDependant=");
		stringBuilder.append(numberOfDependant);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
//	public Builder (final String fName, final String lName) {
//	this.fName = fName;
//	this.lName = lName;			
//}
	
}