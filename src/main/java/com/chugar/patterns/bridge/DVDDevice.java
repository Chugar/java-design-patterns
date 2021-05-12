package com.chugar.patterns.bridge;

public class DVDDevice extends Device {
	
	
	

	public DVDDevice(int newDeviceState, int newMaxSetting) {
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}
	
	@Override
	public void pressLeft() {
		deviceState--;
		checkDevice();
		System.out.println("next chapter " + deviceState);
		
	}

	@Override
	public void pressRight() {
		deviceState++;
		checkDevice();
		System.out.println("previous chapter " + deviceState);
		
	}

}
