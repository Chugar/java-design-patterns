package com.chugar.patterns.facade;

public class BankAccount {
	
	private int userNumber;
	private int userCode;
	
	private Bank yourBank;
	private UserChecker userChecker;
	private AccountChecker accountChecker;
	
	
	public BankAccount(int userNumber, int userCode) {
		
		this.userNumber = userNumber;
		this.userCode = userCode;
		
		yourBank = new Bank();
		userChecker = new UserChecker();
		accountChecker = new AccountChecker();
	}
	
	
	public boolean userLogIn() {
		return userChecker.checkUser(this.userNumber, this.userCode);		
	}
	
	public void makeDeposit(double amount) {
		accountChecker.addAmount(amount);
	}
	
	public void makeWithrawal(double amount) {
		accountChecker.substractAmount(amount);
	}
	
	
	

	
}
