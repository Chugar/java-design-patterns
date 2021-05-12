package com.chugar.patterns.Adapter;

import java.util.Random;

public class EmployeAdapter implements ICustomer {
	
	Employe adaptee;
	

	public EmployeAdapter(Employe adaptee) {
		this.adaptee = adaptee;
	}



	public void showClientNumber() {
		// TODO Auto-generated method stub
		String position = this.adaptee.getPosition();
		int number = new Random().nextInt(100);
		System.out.println(position + " number is " + number);
	}

}
