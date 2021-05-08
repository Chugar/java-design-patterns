package com.chugar.patterns.builder;

public class PhoneBuilder {
	
	private String os;
	private String brand;
	private int price;
	private int ram;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public Phone buildPhone() {
		return new Phone(this.os, this.brand, this.price, this.ram);
	}
	
	

}
