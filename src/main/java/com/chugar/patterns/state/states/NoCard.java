package com.chugar.patterns.state.states;

import com.chugar.patterns.state.ATMMachine;
import com.chugar.patterns.state.ATMState;

public class NoCard implements ATMState {

	ATMMachine machine;

	public NoCard(ATMMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCard() {
		machine.setCurrentState(machine.getHasCard());
		System.out.println("Card inserted");
	}

	@Override
	public void ejectCard() {
		System.out.println("You have no card entered");
	}

	@Override
	public void insertPin(int pin) {
		System.out.println("You have no card entered");
	}

	@Override
	public void requestCash(int amount) {
		System.out.println("You have no card entered");
	}

}
