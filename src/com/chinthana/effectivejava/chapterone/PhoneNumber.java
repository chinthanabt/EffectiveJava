package com.chinthana.effectivejava.chapterone;

public class PhoneNumber {
	private int number;
	private int countryCode;
	private static final PhoneNumber COMMON_NUMBER  = new PhoneNumber(111);
	
	private PhoneNumber(final int number) {		
		this.number = number;
	}

	private PhoneNumber(final int number, final int countryCode) {		
		this.number = number;
		this.countryCode = countryCode;
	}
	
	public static PhoneNumber of(int number) {
		if (COMMON_NUMBER.number == number) 
				return COMMON_NUMBER;
			else 
				return new PhoneNumber(1234);
	}
	
	public static PhoneNumber withCountryCode(int number, int countryCode) {		
		return new PhoneNumber(number, countryCode);
	}
	
	
}
