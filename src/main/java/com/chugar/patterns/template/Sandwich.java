package com.chugar.patterns.template;

public abstract class Sandwich {
	
	protected boolean hasMeat = true;
	protected boolean hasCheese = true;
	protected boolean hasVeggies = true;
	protected boolean hasCondiments = true;
	
	public void makeSandwich() {
		cutBun();
		
		if(this.hasMeat) {
			addMeat();
		}
		
		if(this.hasCheese) {
			addCheese();
		}
		
		if(this.hasVeggies) {
			addVeggies();
		}
		
		if(this.hasCondiments) {
			addCondiments();
		}
	}

	private void cutBun() {
		System.out.println("Cutting the bunnie bunnie");
	}

	protected abstract void addMeat();
	
	protected abstract void addCheese();

	protected abstract void addVeggies();

	protected abstract void addCondiments();



	
	
}
