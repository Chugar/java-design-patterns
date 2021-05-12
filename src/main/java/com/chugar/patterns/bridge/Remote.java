package com.chugar.patterns.bridge;

public abstract class Remote {
	
	Device device;

	public Remote(Device device) {
		this.device = device;
	}
	
	
	public void pressLeft() {
		device.pressLeft();
	}
	
	public void pressRight() {
		device.pressRight();
	}
	
	public void checkRemote() {
		device.checkDevice();
	}
	
	public abstract void pressMiddleButton();
	

}
