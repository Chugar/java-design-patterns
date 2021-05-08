package com.chugar.patterns.strategy;

import com.chugar.patterns.strategy.action.IFly;

public class Animal {

	protected String name;
	protected String type;
	protected IFly flying;

	public Animal() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public IFly getFlying() {
		return flying;
	}

	public void setFlying(IFly flying) {
		this.flying = flying;
	}

	
	public void tryToFly() {
		this.flying.fly();
	}
}
