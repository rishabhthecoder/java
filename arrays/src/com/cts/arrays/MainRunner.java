package com.cts.arrays;

import java.math.BigDecimal;

public class MainRunner {
	public static void main(String arg[]) {
		int[] marks = { 95, 99, 100, 89, 76 };
		Student student = new Student("Rishabh", marks);
		//Variable argument
		Student student1=new Student ("Kia",98,99,100);
		System.out.println(student1.toString());
		int number = student.getNumberOfMarks();
		System.out.println("Number - " + number);
		int total = student.getNumberOfMarks();
		System.out.println("Total - " + total);
		int minimum = student.getMinimumMarks();
		System.out.println("Number - " + minimum);
		int maximum = student.getMinimumMarks();
		System.out.println("Number - " + maximum);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Number - " + average);

	}
}
