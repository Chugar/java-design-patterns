package com.chugar.patterns.strategy;

import com.chugar.patterns.strategy.action.FlyHigh;

public class Bird extends Animal {

	
	private String tweet = "chouw chouw";

	public Bird() {	
		this.flying = new FlyHigh();
	}

	public String getTweet() {
		return tweet;
	}

	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	
	
}
