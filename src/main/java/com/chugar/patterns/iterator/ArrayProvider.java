package com.chugar.patterns.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayProvider implements ProviderIterator {

	private String[] furnitures = {"First from array","Second from array","Third from array"};

	public String[] getFurnitures() {
		return furnitures;
	}

	@Override
	public Iterator<String> getFurnitureIterator() {
		return Arrays.asList(furnitures).iterator();
	}
	
	
}
