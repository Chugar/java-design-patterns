package com.chugar.patterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ScrableSingleton {

	private static ScrableSingleton instance = null;

	public String[] aplhabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public LinkedList<String> tiles = new LinkedList<String>(Arrays.asList(aplhabet));

	private ScrableSingleton() {
	}

	public static ScrableSingleton getInstance() {

		if (instance == null) {
			instance = new ScrableSingleton();
		}

		Collections.shuffle(instance.tiles);
		return instance;
	}

	public LinkedList<String> getTiles(int size) {
		
		LinkedList<String> newTile = new LinkedList<String>();
		
		for (int i = 0; i < size; i++) {
			newTile.add(tiles.remove(i));
		}
		
		return newTile;
	}

}
