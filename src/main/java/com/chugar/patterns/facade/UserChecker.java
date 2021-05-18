package com.chugar.patterns.facade;

public class UserChecker {

	public boolean checkUser(int userNumber, int userCode) {
		// hard-coded logic
		if (userNumber == 213 && userCode == 1234) {
			return true;
		} else {
			return false;
		}
		
	}

}
