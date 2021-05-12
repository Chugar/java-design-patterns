package com.chugar.patterns.bridge;

public abstract class Device {
	
	public int deviceState;
	public int maxSetting;
	public int volumeSetting;
	
	

	public abstract void pressLeft();
	public abstract void pressRight();
	
	public void pressUp() {
		volumeSetting++;
	}
	
	public void pressDown() {
		volumeSetting--;
	}
	
	public void checkDevice() {
		if(deviceState > maxSetting || deviceState < 0 ) {
			deviceState = 0;
		}
	}

}
