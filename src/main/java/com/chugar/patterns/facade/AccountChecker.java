package com.chugar.patterns.facade;

public class AccountChecker {

	private double amount = 0.00;
	
	public void addAmount(double toAdd) {
		amount += toAdd;
		System.out.println("Money added, current account " + this.amount);

	}
	
	public void substractAmount(double toSubstract) {
		if(enoughMoney(toSubstract)) {
			amount -= toSubstract;
			System.out.println("Withrawal, current account " + this.amount);
		}
	}
	
	public boolean enoughMoney(double withdrawal ) {
		if(amount < withdrawal) {
			System.out.println("not enought money");
			return false;
		} else {
			return true;
		}
	} 
	
}
