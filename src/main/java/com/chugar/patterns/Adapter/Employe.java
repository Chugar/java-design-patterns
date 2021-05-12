package com.chugar.patterns.Adapter;

public class Employe {

	private String position;
	private int salary;
	
	public Employe(String position, int salary) {
		this.position = position;
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public int getSalary() {
		return salary;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
