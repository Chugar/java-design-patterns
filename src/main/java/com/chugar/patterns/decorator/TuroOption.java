package com.chugar.patterns.decorator;

public class TuroOption extends CarDecorator {

	public TuroOption(Car decoratedCar) {
		super(decoratedCar);
	}
	
	public String getDescription() {
		return decoratedCar.getDescription() + ", Turbo Option";
	}
	
	public Double getCost() {
		return decoratedCar.getCost() + 12.00;
	}
}
