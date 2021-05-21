package com.chugar.patterns.bridge.implementation;

public class CrowBar implements Key {

	@Override
	public void open() {
		System.out.println("Breaks that door open");
		
	}

	@Override
	public void close() {
		System.out.println("Could not close the door");
	}

}
