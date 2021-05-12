package com.chugar.patterns.bridge;

public class MuteRemote extends Remote {

	public MuteRemote(Device device) {
		super(device);
	}

	@Override
	public void pressMiddleButton() {
		System.out.println("Muted device");
	}

}
