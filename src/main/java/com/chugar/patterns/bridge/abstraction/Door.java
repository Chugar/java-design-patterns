package com.chugar.patterns.bridge.abstraction;

import com.chugar.patterns.bridge.implementation.Key;

public abstract class Door {
	
	private Key key;

	public Door(Key key) {
		this.key = key;
	}
	
	public void openDoor() {
		this.key.open();
	}
	
	public void closeDoor() {
		this.key.close();
	}

}
