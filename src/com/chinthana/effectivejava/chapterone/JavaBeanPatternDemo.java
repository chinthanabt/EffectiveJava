package com.chinthana.effectivejava.chapterone;

public class JavaBeanPatternDemo {
	public static void main (String ...arg) {
	
		Employee emp1 = new Employee();
		
		//Using Java Bean Pattern, setting the required fields.
		emp1.setfName("Chinthana");
		emp1.setlName("Thennakoon");
		emp1.setEmpNumber(1234);
		emp1.setIdNumber("56665566v");
	}
}
