package com.chugar.patterns.observer;

/**
 * Subject
 * 
 * Lorsqu'il change d'état, celui-ci emet des notifications
 * Les notifications sont destinées aux observers
 *
 */
public interface Subject {
	
	void register(Observer o);
	void unregister(Observer o);
	void notifyObservers();

}
