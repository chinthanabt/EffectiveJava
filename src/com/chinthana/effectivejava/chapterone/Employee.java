package com.chinthana.effectivejava.chapterone;

public class Employee {
	private String fName;
	private String lName;
	private String email;
	private String idNumber;
	private int empNumber;
	private String address;
	private String phone;
	private String gender;
	private String religion;
	private String marriageStatus;
	
	//No argument constructor
	public Employee() {
		
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

}
