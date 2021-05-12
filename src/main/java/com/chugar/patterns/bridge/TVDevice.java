package com.chugar.patterns.bridge;


/**
 * Concrete implementer
 */
public class TVDevice extends Device {
	
		

	public TVDevice(int newDeviceState, int newMaxSetting) {
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
		
	}

	@Override
	public void pressLeft() {
		System.out.println("Channel down " + deviceState);
		deviceState--;
		checkDevice();

	}

	@Override
	public void pressRight() {
		System.out.println("Channel up " + deviceState);
		deviceState++;
		checkDevice();
	}

}
