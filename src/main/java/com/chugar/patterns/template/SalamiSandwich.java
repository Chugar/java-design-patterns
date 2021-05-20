package com.chugar.patterns.template;

public class SalamiSandwich extends Sandwich {

	@Override
	protected void addMeat() {
		System.out.println("Adding samali");
		
	}

	@Override
	protected void addCheese() {
		System.out.println("Adding cheese");
		
	}

	@Override
	protected void addVeggies() {
		System.out.println("Plus some veggies");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("And then condiments");
	}

}
