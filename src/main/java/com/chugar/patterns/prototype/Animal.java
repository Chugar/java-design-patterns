package com.chugar.patterns.prototype;

import java.time.LocalDate;

public abstract class Animal implements Cloneable {

	private String petname;
	private LocalDate age;

	public Animal(String petname, LocalDate age) {
		this.petname = petname;
		this.age = age;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public LocalDate getAge() {
		return age;
	}

	public void setAge(LocalDate age) {
		this.age = age;
	}

	abstract public Animal makeCopy();

}
