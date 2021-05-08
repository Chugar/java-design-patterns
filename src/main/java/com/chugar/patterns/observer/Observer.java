package com.chugar.patterns.observer;

public interface Observer<T> {

	void update(T updatable);
}
