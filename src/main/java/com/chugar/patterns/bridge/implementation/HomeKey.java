package com.chugar.patterns.bridge.implementation;

public class HomeKey implements Key {

	@Override
	public void open() {
		System.out.println("Opens the door of my sweet home");
	}

	@Override
	public void close() {
		System.out.println("Closes the door of my sweet home");
	}

}
