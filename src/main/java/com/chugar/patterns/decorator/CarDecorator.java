package com.chugar.patterns.decorator;

public class CarDecorator implements Car {
	
	Car decoratedCar;

	public CarDecorator(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	public String getDescription() {
		return this.decoratedCar.getDescription();
	}

	public Double getCost() {
		return this.decoratedCar.getCost();
	}
	
	
	

}
