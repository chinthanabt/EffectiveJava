package com.chinthana.effectivejava.chapterone;

public class PhoneNumber {
	private final int countryCode;
	private final int areaCode;
	private final int number;	
	
	private static final PhoneNumber COMMON_NUMBER = new PhoneNumber(11, 11, 1111111);

	public PhoneNumber(final int countryCode, final int areaCode, final int number) {
		this.areaCode = areaCode;
		this.countryCode = countryCode;
		this.number = number;
		
	}

	public static PhoneNumber of(final int countryCode, final int areaCode, final int number) {
		if (COMMON_NUMBER.countryCode == countryCode && COMMON_NUMBER.areaCode == areaCode && COMMON_NUMBER.number == number)
			return COMMON_NUMBER;
		else					
			return new PhoneNumber(countryCode, areaCode, number);
	}		
	
}


//switch (countryCode) {
//case 94:
//	return new SriLankanPhoneNumber(countryCode, areaCode, number);
//case 91:
//	return new IndianPhoneNumber(countryCode, areaCode, number);
//case 1:
//	return new AmericanPhoneNumber(countryCode, areaCode, number);				
//}	

