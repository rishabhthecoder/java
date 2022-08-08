package com.cts.example1;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
	public static void main(String arg[]) {
		SimpleInterestCalculator calculator=new SimpleInterestCalculator("100","7.5");
		BigDecimal totalValue=calculator.calculateTotalValue(1);
		System.out.println(totalValue);
	}

}
