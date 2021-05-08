package com.chugar.patterns.decorator;

public class SunroofOption extends CarDecorator {

	public SunroofOption(Car decoratedCar) {
		super(decoratedCar);
	}
	
	public String getDescription() {
		return decoratedCar.getDescription() + ", rooftop";
	}

	public Double getCost() {
		return decoratedCar.getCost() + 12.00;
	}
}
