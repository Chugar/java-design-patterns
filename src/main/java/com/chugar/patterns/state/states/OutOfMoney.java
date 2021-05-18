package com.chugar.patterns.state.states;

import com.chugar.patterns.state.ATMMachine;
import com.chugar.patterns.state.ATMState;

public class OutOfMoney implements ATMState {
	
	ATMMachine machine;

	public OutOfMoney(ATMMachine machine) {
		this.machine = machine;
	}


	@Override
	public void insertCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertPin(int pin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestCash(int amount) {
		// TODO Auto-generated method stub

	}

}
