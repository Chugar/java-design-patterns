package com.chugar.patterns.iterator;

import java.util.Iterator;

public class IterationReader {
	
	public static void readFurnitures(Iterator<String> furnitures) {
		
		while (furnitures.hasNext()) {
			String currentFurniture = (String) furnitures.next();
			System.out.println(currentFurniture);
		}
	}

}
