package com.chugar.patterns.chainOfResponsibility;

public class ChainMax implements MathChain {
	
	MathChain currentChain;

	@Override
	public MathChain setNextChain(MathChain chain) {
		this.currentChain = chain;
		return chain;
	}

	@Override
	public void calculate(Numbers numbers) {
		if(numbers.getOperation().equals("max")) {
			
			 int max = numbers.getNumbers().stream()
				.mapToInt(Integer::intValue)
				.max()
				.orElse(0);
			 
			System.out.println(max);
		} else {
			this.currentChain.calculate(numbers);
		}
		
	}

}
