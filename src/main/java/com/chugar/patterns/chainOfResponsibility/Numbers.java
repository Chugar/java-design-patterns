package com.chugar.patterns.chainOfResponsibility;

import java.util.List;

public class Numbers {
	
	private List<Integer> numbers;
	private String operation;
	
	
	public Numbers(List<Integer> numbers, String operation) {
		this.numbers = numbers;
		this.operation = operation;
	}


	public List<Integer> getNumbers() {
		return numbers;
	}


	public String getOperation() {
		return operation;
	}

	
	

}
