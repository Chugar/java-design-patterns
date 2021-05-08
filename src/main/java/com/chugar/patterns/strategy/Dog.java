package com.chugar.patterns.strategy;

import com.chugar.patterns.strategy.action.CantFly;

public class Dog extends Animal {

	private String bark = "wouf";

	public Dog() {
		this.flying = new CantFly();
	}

	public String getBark() {
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}

}
