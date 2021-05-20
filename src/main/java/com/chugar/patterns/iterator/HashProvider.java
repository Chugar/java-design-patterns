package com.chugar.patterns.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class HashProvider implements ProviderIterator {
	
	private Hashtable<Integer, String> furnitures = new Hashtable<>();

	public HashProvider() {
		furnitures.put(1, "First from Hash");
		furnitures.put(2, "Second from Hash");
		furnitures.put(3, "Third from Hash");
	}

	public Hashtable<Integer, String> getFurnitures() {
		return furnitures;
	}

	@Override
	public Iterator<String> getFurnitureIterator() {
		return furnitures.values().iterator();
	}
	
	
	


}
