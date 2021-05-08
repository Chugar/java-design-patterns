package com.chugar.patterns.decorator;

public class PlainCar implements Car {

	public String getDescription() {
		return "Plain car";
	}

	public Double getCost() {
		return 10000.00;
	}

}
