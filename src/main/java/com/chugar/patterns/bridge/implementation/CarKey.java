package com.chugar.patterns.bridge.implementation;

public class CarKey implements Key {

	@Override
	public void open() {
		System.out.println("Opens the door of the car" );
		
	}

	@Override
	public void close() {
		System.out.println("Closes the door of the car" );
	}

}
