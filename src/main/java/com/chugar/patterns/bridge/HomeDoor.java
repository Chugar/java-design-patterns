package com.chugar.patterns.bridge;

import com.chugar.patterns.bridge.abstraction.Door;
import com.chugar.patterns.bridge.implementation.Key;

public class HomeDoor extends Door {
	
	private String homeAdress;

	public HomeDoor(Key key, String homeAdress) {
		super(key);
		this.homeAdress = homeAdress;
		System.out.println("Welcome to " + this.homeAdress);
	}

	

}
