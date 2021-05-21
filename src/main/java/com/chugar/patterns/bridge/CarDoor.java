package com.chugar.patterns.bridge;

import com.chugar.patterns.bridge.abstraction.Door;
import com.chugar.patterns.bridge.implementation.Key;

public class CarDoor extends Door {
	
	private String carModel;	
	
	public CarDoor(Key key, String carModel) {
		super(key);
		this.carModel = carModel;
		System.out.println("Car model " + this.carModel);
	}

	
	

}
