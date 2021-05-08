package com.chugar.patterns.prototype;

import java.time.LocalDate;

public class Sheep extends Animal{

	private String sound;


	public Sheep(String petname, LocalDate age, String sound) {
		super(petname, age);
		this.setSound(sound);
	}
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	

	@Override
	public Animal makeCopy() {
		
		Animal copy = null;
		
		try {
			copy = (Animal) super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return copy;
	}

}
