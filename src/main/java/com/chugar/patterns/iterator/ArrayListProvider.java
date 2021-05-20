package com.chugar.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProvider implements ProviderIterator {
	
	ArrayList<String> furnitures = new ArrayList<>();

	public ArrayListProvider() {
		furnitures.add("First from arrayList");
		furnitures.add("Second from arrayList");
		furnitures.add("Third from arrayList");
	}

	public ArrayList<String> getFurnitures() {
		return furnitures;
	}

	@Override
	public Iterator<String> getFurnitureIterator() {
		return  furnitures.iterator();
	}


}
