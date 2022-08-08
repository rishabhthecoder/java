package com.List;

import java.util.Stack;

public class Stacks {
	public static void main(String arg[]) {
		Stack<Double> s1=new Stack<>();
		s1.push(4.5D);
		s1.add(4.6D);
		s1.push(4.7D);
		for(double d:s1) {
			System.out.println(d);
		}
		System.out.println(s1.pop());
		//s1.remove(1);
		System.out.println("After popping one element");
		for(double d:s1) {
			System.out.println(d);
		}
	}
}
