package com.chugar.patterns.chainOfResponsibility;

public class ChainAdd implements MathChain {
	
	MathChain currentChain;

	@Override
	public MathChain setNextChain(MathChain chain) {
		this.currentChain = chain;
		return chain;
	}

	@Override
	public void calculate(Numbers numbers) {
		
		if(numbers.getOperation().equals("add")) {
			int total = numbers.getNumbers().stream()
				.mapToInt(Integer::intValue)
				.sum();
			
			System.out.println("add = " + total);
		} else {
			currentChain.calculate(numbers);
		}
		
	}

}
