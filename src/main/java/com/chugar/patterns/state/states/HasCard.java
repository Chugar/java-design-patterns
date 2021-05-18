package com.chugar.patterns.state.states;

import com.chugar.patterns.state.ATMMachine;
import com.chugar.patterns.state.ATMState;

public class HasCard implements ATMState {
	
	ATMMachine machine;
	
	

	public HasCard(ATMMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCard() {
		System.out.println("it already has a card");

	}

	@Override
	public void ejectCard() {
		machine.setCurrentState(machine.getHasNoCard());
		System.out.println("Card is ejected");

	}

	@Override
	public void insertPin(int pin) {
		if (pin == 1234) {
			System.out.println("Correct code");
			machine.setCurrentState(machine.getPinIsCorrect());
		} else {
			System.out.println("Wrong code, card rejected");
			machine.setCurrentState(machine.getHasNoCard());
		}

	}

	@Override
	public void requestCash(int amount) {
		System.out.println("Enter your pin");
	}

}
