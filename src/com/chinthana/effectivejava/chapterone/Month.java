package com.chinthana.effectivejava.chapterone;

public enum Month {
	
	JAN(1, "january", "very cold"), 
	FEB(2, "february", "short month"), 
	MAR(3, "march", "no special"), 
	APR(4, "april", "new year celebration");
	
	private int id;
	private String value;
	private String desc;
	
	Month(int id, String value, String desc) {
		this.id = id;
		this.value = value;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}	

}
