package com.chugar.patterns.observer;

import java.util.ArrayList;

public class Magasin implements Subject {
	
	private static int ID_COUNTER = 0;
	private int id;
	private int laptopStock = 0;
	
	
	
	public Magasin() {
		this.id = ++ID_COUNTER;
	}
	
	

	public int getId() {
		return id;
	}



	public int getLaptopStock() {
		return laptopStock;
	}

	public void setLaptopStock(int laptopStock) {
		this.laptopStock = laptopStock;
		notifyObservers();
	}

	ArrayList<Observer> clients = new ArrayList<Observer>();

	public void register(Observer o) {
		clients.add(o);
	}

	public void unregister(Observer o) {
		clients.remove(clients.indexOf(o));
	}

	public void notifyObservers() {
		for (Observer o : clients) {
			o.update(this);
		}
	}

}
