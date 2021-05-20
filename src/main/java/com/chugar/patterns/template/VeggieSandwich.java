package com.chugar.patterns.template;

public class VeggieSandwich extends Sandwich {
	
	boolean hasMeat = false;
	boolean hasCheese = false;

	@Override
	protected void addMeat() {
		// Empty method
		
	}

	@Override
	protected void addCheese() {
		// Empty method 
		
	}

	@Override
	protected void addVeggies() {
		System.out.println("Some yummy veggies for a good green sandwich");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("Olive oil and vinegar");
		
	}

}
