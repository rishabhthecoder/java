package com.cts.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
	private String name;
	private int[] marks;

	public Student(String name, int... marks) {
		super();
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.length;
	}

	public int getTotalOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i : marks)
			sum = sum + i;
		return sum;
	}

	public int getMaximumMarks() {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for (int i : marks)
			if (i > max)
				max = i;
		return max;
	}

	public int getMinimumMarks() {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		for (int i : marks)
			if (i < min)
				min = i;
		return min;
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		return (new BigDecimal(getTotalOfMarks()).divide(new BigDecimal(getNumberOfMarks()), 3, RoundingMode.UP));
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}

}
