package com.chugar.patterns.chainOfResponsibility;

public interface MathChain {
	
	MathChain setNextChain(MathChain chain);
	void calculate(Numbers numbers);

}
