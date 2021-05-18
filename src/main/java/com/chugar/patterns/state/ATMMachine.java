package com.chugar.patterns.state;

import com.chugar.patterns.state.states.HasCard;
import com.chugar.patterns.state.states.NoCard;
import com.chugar.patterns.state.states.OutOfMoney;
import com.chugar.patterns.state.states.HasPin;

public class ATMMachine {
	
	private int availableCash = 20000000;
	private boolean isPinCorrect = false;
	
	/* different states */
	public ATMState currentState;
	public ATMState hasCard;
	public ATMState hasNoCard;
	public ATMState pinIsCorrect;
	public ATMState outOfMoney;
	
	
	

	
	public ATMMachine() {
		hasCard = new HasCard(this);
		hasNoCard = new NoCard(this);
		pinIsCorrect = new HasPin(this);
		outOfMoney = new OutOfMoney(this);
		
		currentState = hasNoCard;
		
	}

	public void insertCard() {
		currentState.insertCard();
	}
	
	public void ejectCard() {
		currentState.ejectCard();
	}
	
	public void requestCash(int amout) {
		currentState.requestCash(amout);
	}
	
	public void insertpin(int pin) {
		currentState.insertPin(pin);
	}

	public ATMState getCurrentState() {
		return currentState;
	}

	public ATMState getHasCard() {
		return hasCard;
	}

	public ATMState getHasNoCard() {
		return hasNoCard;
	}

	public ATMState getPinIsCorrect() {
		return pinIsCorrect;
	}

	public ATMState getOutOfMoney() {
		return outOfMoney;
	}
	
	public int getAvailableCash() {
		return availableCash;
	}
	
	public void substractToAvailable(int amount) {
		availableCash -= amount;
	}
	 
	public void setCurrentState(ATMState state) {
		currentState = state;
	}

} 
