package com.chugar.patterns.chainOfResponsibility;

public class ChainMin implements MathChain {
	
	MathChain currentChain;

	@Override
	public MathChain setNextChain(MathChain chain) {
		this.currentChain = chain;
		return chain;
	}

	@Override
	public void calculate(Numbers numbers) {
		if(numbers.getOperation().equals("min")) {
			
			 int min = numbers.getNumbers().stream()
				.mapToInt(Integer::intValue)
				.min()
				.orElse(0);
			 
			System.out.println(min);
		} else {
			this.currentChain.calculate(numbers);
		}
		
	}

}
