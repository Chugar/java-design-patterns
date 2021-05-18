package com.chugar.patterns.state.states;

import com.chugar.patterns.state.ATMMachine;
import com.chugar.patterns.state.ATMState;

public class HasPin implements ATMState {
	
	ATMMachine machine;

	public HasPin(ATMMachine machine) {
		this.machine = machine;
	}


	@Override
	public void insertCard() {
		System.out.println("You already entered a card");
	}

	@Override
	public void ejectCard() {
		//
		machine.setCurrentState(machine.getHasNoCard());
		System.out.println("Your card is ejected");
	}

	@Override
	public void insertPin(int pin) {
		System.out.println("You already inserted a pin");

	}

	@Override
	public void requestCash(int amount) {
		
		// request cash
		if(amount < machine.getAvailableCash()) {
			
			machine.substractToAvailable(amount);
			System.out.println("Your request " + amount + "$");
			
			
			machine.setCurrentState(machine.getHasNoCard());
			System.out.println("Card ejected");
		}
		
	}

}
