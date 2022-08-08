package com.cts.example1;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principle;
	private BigDecimal interest;
	public SimpleInterestCalculator(String principle,String interest) {
		super();
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest);
	}
	public BigDecimal calculateTotalValue(int i) {
		// TODO Auto-generated method stub
		//TotalValue=principal+principal*interest*noOfYears;
		BigDecimal totalValue=principle.add
				(principle.multiply
						(interest.divide
								(new BigDecimal("100"))).multiply(new BigDecimal(i)));
		boolean a=false;
		return totalValue;
	}
	
	

}
