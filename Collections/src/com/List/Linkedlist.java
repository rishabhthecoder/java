package com.List;

import java.util.LinkedList;
import java.util.Collection;
import java.util.List;

public class Linkedlist {
	public static void main(String arg[]) throws Exception {
		System.out.println("LinkedList using Collection as Reference Type");
		Collection<Integer> a1 = new LinkedList<>();
		a1.add(5);
		a1.add(6);
		a1.add(6);
		for (int a : a1) {
			System.out.println(a);
		}
		System.out.println("LinkedList using List as Reference Type");
		List<Float> a2 = new LinkedList<>();
		a2.add(5.5F);
		a2.add(3.4F);
		a2.add(5.5F);
		for (float a : a2)
			System.out.println(a);

		System.out.println("LinkedList using LinkedList as Reference Type");
		LinkedList<String> a3 = new LinkedList<>();
		a3.add("Hello");
		a3.add("This is");
		a3.add("Rishabh");
		a3.add("Rishabh");
		for (String a : a3)
			System.out.println(a);
		a3.remove();
		
		System.out.println(a3);

	}

}
