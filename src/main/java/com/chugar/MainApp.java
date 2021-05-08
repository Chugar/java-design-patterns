package com.chugar;

import java.time.LocalDate;
import java.util.LinkedList;

import com.chugar.patterns.builder.Phone;
import com.chugar.patterns.builder.PhoneBuilder;
import com.chugar.patterns.decorator.CarDecorator;
import com.chugar.patterns.decorator.PlainCar;
import com.chugar.patterns.decorator.SunroofOption;
import com.chugar.patterns.decorator.TuroOption;
import com.chugar.patterns.observer.Client;
import com.chugar.patterns.observer.Magasin;
import com.chugar.patterns.prototype.Animal;
import com.chugar.patterns.prototype.Sheep;
import com.chugar.patterns.singleton.ScrableSingleton;
import com.chugar.patterns.strategy.Bird;
import com.chugar.patterns.strategy.Dog;
import com.chugar.patterns.strategy.action.FlyHigh;
import com.chugar.patterns.decorator.Car;

public class MainApp {

	public static void main(String[] args) {
		
		
		// observerPattern();
		// singletonPattern();
		// prototypePattern();
		// builderPattern();
		decoratorPattern();
	}

	
	
	
	/**
	 * Strategy Pattern
	 * Behavioral pattern
	 * 
	 * Switches dynamically between different algorithms
	 * Uses composition and interfacing to accomplish that goal
	 */
	public static void strategyPattern() {
		
		Dog chien = new Dog();
		Bird zawech = new Bird();
		
		chien.tryToFly();
		zawech.tryToFly();
		
		// Determiner le comportement à la volée
		chien.setFlying(new FlyHigh());
		chien.tryToFly();
		
	}
	
	/**
	 * Observer pattern
	 * Behavioral pattern
	 * 
	 * 'Subject' notifies 'Observers' whenever its own state changes
	 */
	public static void observerPattern() {
		
		Magasin appleStore = new Magasin();
		
		Client client1 = new Client();
		Client client2 = new Client();
		
		appleStore.register(client1);
		appleStore.register(client2);
		
		// Ici le changement apparait
		appleStore.setLaptopStock(12);
		
	}
	
	
	/**
	 * Singleton
	 * Creational pattern
	 * 
	 * Creates and shares one unique instance of a class
	 * TODO: make it thread safe
	 */
	public static void singletonPattern() {
		
		ScrableSingleton scrable1 = ScrableSingleton.getInstance();
		System.out.println(System.identityHashCode(scrable1));
		LinkedList<String> tiles1 = scrable1.getTiles(5);
		System.out.println(tiles1);
		System.out.println(scrable1.tiles);
		
		ScrableSingleton scrable2 = ScrableSingleton.getInstance();
		System.out.println(System.identityHashCode(scrable2));
		LinkedList<String> tiles2 = scrable2.getTiles(5);
		System.out.println(tiles2);
		System.out.println(scrable2.tiles);
		
	}
	
	
	/**
	 * Prototype
	 * Creational pattern
	 * 
	 * Creates an instance from an already existing object
	 */
	public static void prototypePattern() {
		
		Sheep maah = new Sheep("Tahr", LocalDate.of(2010, 8, 22), "bahhh");
		Sheep maah2 = (Sheep) maah.makeCopy();
		
		System.out.println(System.identityHashCode(maah));
		System.out.println(System.identityHashCode(maah2));
		
		System.out.printf("%s is born at %s \n", maah.getPetname(), maah.getAge());
		System.out.printf("%s is bord at %s \n", maah2.getPetname(), maah.getAge());

		System.out.println(maah.getSound());
		System.out.println(maah2.getSound());
	}
	
	/**
	 * Builder
	 * Creational pattern
	 * 
	 * Helps creating a complex object by bypassing a parameterized construct creation
	 */
	public static void builderPattern() {
		PhoneBuilder phoneBuilder = new PhoneBuilder();
		Phone smartphone = phoneBuilder
			.setBrand("brand")
			.setOs("os")
			.setPrice(123)
			.setRam(254)
			.buildPhone();
		
		System.out.println(smartphone);
	}
	
	/**
	 * 
	 */
	public static void decoratorPattern() {
		Car myCar = new PlainCar();
		
		myCar = new TuroOption(myCar);
		myCar = new SunroofOption(myCar);
		
		System.out.println(myCar.getDescription());
	}
}
