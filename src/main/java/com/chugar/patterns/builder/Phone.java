package com.chugar.patterns.builder;

public class Phone {
	
	private String os;
	private String brand;
	private int price;
	private int ram;
	
	public Phone(PhoneBuilder builder) {
		this.os = builder.getOs();
		this.brand = builder.getBrand();
		this.price = builder.getPrice();
		this.ram = builder.getRam();
	}
	
	public static PhoneBuilder newPhone() {
		return new PhoneBuilder();
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	
	
	

}
