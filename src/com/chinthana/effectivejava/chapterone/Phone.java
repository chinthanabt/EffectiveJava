package com.chinthana.effectivejava.chapterone;

public class Phone {
	final String manumanufacturer;
	final String version;
	final double ram;
	final String color;
	final double memory;
	String cpu;
	String os;
	// int serialNumber;
	// int imeiNumber;
	// double screenSize;
	// double weight;
	// double talkTime;

	// Constructor with mandatory fields
	public Phone(final String manumanufacturer, final String version) {
		this(manumanufacturer, version, 2);
	}

	// Constructor with one optional field
	public Phone(final String manumanufacturer, final String version, final double ram) {

		this(manumanufacturer, version, ram, "Black");
	}

	// Constructor with two optional fields
	public Phone(final String manumanufacturer, final String version, final double ram, final String color) {
		this(manumanufacturer, version, ram, color, 32);
	}

	// Constructor with three optional fields
	public Phone(final String manumanufacturer, final String version, final double ram, final String color,
			final double memory) {
		this(manumanufacturer, version, ram, color, memory, "Hexa-core");
	}

	// Constructor with four optional fields
	protected Phone(String manumanufacturer, String version, double ram, String color, double memory, String cpu) {
		this(manumanufacturer, version, ram, color, memory, cpu, "iOS 12");
	}
	
	// Constructor with five optional fields
	protected Phone(String manumanufacturer, String version, double ram, String color, double memory, String cpu,
			String os) {		
		this.manumanufacturer = manumanufacturer;
		this.version = version;
		this.ram = ram;
		this.color = color;
		this.memory = memory;
		this.cpu = cpu;
		this.os = os;
	}

	@Override
	public String toString() {
		return "Phone [manumanufacturer=" + manumanufacturer + ", version=" + version + ", ram=" + ram + ", color="
				+ color + ", memory=" + memory + ", cpu=" + cpu + ", os=" + os + "]";
	}
	
}
