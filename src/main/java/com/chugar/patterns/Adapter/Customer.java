package com.chugar.patterns.Adapter;

import java.util.Random;

public class Customer implements ICustomer {

	private String firstname;
	private String lastname;
	
	
	public Customer(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void showClientNumber() {
		Random random = new Random();
		int number = random.nextInt(100);
		System.out.println(this.firstname + " number is " + number);
		
	}
	
	
	
}
