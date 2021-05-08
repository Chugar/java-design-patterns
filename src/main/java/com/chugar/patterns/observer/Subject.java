package com.chugar.patterns.observer;

/**
 * Subject
 * 
 * Lorsqu'il change d'�tat, celui-ci emet des notifications
 * Les notifications sont destin�es aux observers
 *
 */
public interface Subject {
	
	void register(Observer o);
	void unregister(Observer o);
	void notifyObservers();

}
