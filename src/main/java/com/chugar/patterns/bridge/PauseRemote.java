package com.chugar.patterns.bridge;


public class PauseRemote extends Remote {

	public PauseRemote(Device device) {
		super(device);
	}

	@Override
	public void pressMiddleButton() {
		System.out.println("Pause...");
	}

}
