package com.chugar;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;

import com.chugar.patterns.Adapter.Customer;
import com.chugar.patterns.Adapter.Employe;
import com.chugar.patterns.Adapter.EmployeAdapter;
import com.chugar.patterns.Adapter.ICustomer;
import com.chugar.patterns.bridge.DVDDevice;
import com.chugar.patterns.bridge.MuteRemote;
import com.chugar.patterns.bridge.PauseRemote;
import com.chugar.patterns.bridge.Remote;
import com.chugar.patterns.bridge.TVDevice;
import com.chugar.patterns.builder.Phone;
import com.chugar.patterns.chainOfResponsibility.ChainAdd;
import com.chugar.patterns.chainOfResponsibility.ChainMax;
import com.chugar.patterns.chainOfResponsibility.ChainMin;
import com.chugar.patterns.chainOfResponsibility.MathChain;
import com.chugar.patterns.chainOfResponsibility.Numbers;
import com.chugar.patterns.composite.Song;
import com.chugar.patterns.composite.SongComponent;
import com.chugar.patterns.composite.SongGroup;
import com.chugar.patterns.decorator.Car;
import com.chugar.patterns.decorator.PlainCar;
import com.chugar.patterns.decorator.SunroofOption;
import com.chugar.patterns.decorator.TuroOption;
import com.chugar.patterns.facade.BankAccount;
import com.chugar.patterns.observer.Client;
import com.chugar.patterns.observer.Magasin;
import com.chugar.patterns.prototype.Sheep;
import com.chugar.patterns.singleton.ScrableSingleton;
import com.chugar.patterns.state.ATMMachine;
import com.chugar.patterns.strategy.Bird;
import com.chugar.patterns.strategy.Dog;
import com.chugar.patterns.strategy.action.FlyHigh;

public class MainApp {

	public static void main(String[] args) {
		
		
		// observerPattern();
		// singletonPattern();
		// prototypePattern();
		// builderPattern();
		// decoratorPattern();
		// adapterPattern();
		// bridgePattern();
		// chainOfResponsibility();
		// compositePattern();
		// facadePattern();
		statePattern();
		
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
	 * Creates a copy from an existing object
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
	 * Helps creating complex objects
	 * Bypasses a parameterized construct
	 * 
	 */
	public static void builderPattern() {
		
		Phone smartphone = Phone.newPhone()
			.setBrand("brand")
			.setOs("os")
			.setPrice(123)
			.setRam(254)
			.buildPhone();
		
		System.out.println(smartphone);
	}
	
	/**
	 * Decorator
	 * Structural pattern
	 * 
	 * 
	 */
	public static void decoratorPattern() {
		
		Car myCar = new PlainCar();
		
		myCar = new TuroOption(myCar);
		myCar = new SunroofOption(myCar);
		
		System.out.println(myCar.getDescription());
	}
	
	/**
	 * Adapter
	 * Structural pattern
	 * 
	 * Allows two unrelated interfaces to have the same behavior
	 * without changing any of the two
	 */
	public static void adapterPattern() {
		
		Customer benoit = new Customer("Benoit", "Duchene");
		Employe dev = new Employe("le dev de la boite", 4200);
		ICustomer leDev = new EmployeAdapter(dev);
		
		benoit.showClientNumber();
		leDev.showClientNumber();
	}
	
	/**
	 * Bridge
	 * Structural pattern
	 * 
	 * Decouples an abstraction from its implementation
	 */
	public static void bridgePattern() {
		Remote pauseRemote = new PauseRemote(new TVDevice(1, 200));
		Remote muteRemote =  new MuteRemote(new TVDevice(1, 200));
		Remote dvdPauseRemote = new PauseRemote(new DVDDevice(0, 15));
		
		pauseRemote.pressRight();
		pauseRemote.pressLeft();
		pauseRemote.pressMiddleButton();
		System.out.println();
		
		muteRemote.pressRight();
		muteRemote.pressLeft();
		muteRemote.pressMiddleButton();
		System.out.println();
		
		dvdPauseRemote.pressRight();
		dvdPauseRemote.pressLeft();
		dvdPauseRemote.pressLeft();
		dvdPauseRemote.pressMiddleButton();
		
	}
	
	
	/**
	 * Chain of responsibility
	 * Behavioral pattern
	 * 
	 * Allows to pass requests along a chain of handlers
	 * Then decides to process the request or to pass it to the next handler
	 */
	public static void chainOfResponsibilityPattern() {
		
		MathChain chainAdd = new ChainAdd();
		MathChain chainMin = new ChainMin();
		MathChain chainMax = new ChainMax();
		
		chainAdd
			.setNextChain(chainMin)
			.setNextChain(chainMax);
		
		Numbers n = new Numbers(Arrays.asList(12,3,5,75), "max");
		chainAdd.calculate(n);
		
	}
	
	
	
	/**
	 * Composite
	 * Structural pattern
	 * 
	 * Its purpose is to create tree structure hierarchy
	 */
	public static void compositePattern() {
		
		SongComponent soul = new SongGroup("Soul music", "Bla bla bla");
		SongComponent neoSoul = new SongGroup("Neo Soul", "Nice fuzzy and mellow");
		
		soul.add(neoSoul);
		soul.add(new Song("Oh mama", "marvin gaye", LocalDate.of(1970, 7, 13)));
		soul.add(new Song("Lets stay together", "al green", LocalDate.of(1972, 8, 21)));
		
		
		soul.displaySongInfo();

	}
	
	
	/**
	 * Facade
	 */
	public static void facadePattern() {
		
		BankAccount myAccount = new BankAccount(213, 1234);
		
		// Hidden actions performed by other objects
		myAccount.userLogIn();
		myAccount.makeWithrawal(300.00);
		myAccount.makeDeposit(2000.00);
		myAccount.makeWithrawal(300.00);
		
	}
	
	
	
	/**
	 * State pattern
	 */
	public static void statePattern() {
		ATMMachine machine = new ATMMachine();
		machine.insertCard();
		machine.insertCard();
		machine.ejectCard();
		
		machine.insertCard();
		machine.insertpin(1234);
		machine.requestCash(20000);	
		machine.ejectCard();	
	}
	

} 
