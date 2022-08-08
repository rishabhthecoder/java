package com.List;

import java.util.*;

public class Arrayslist {
	// @SuppressWarnings("unchecked")
	public static void main(String arg[]) throws Exception {
		System.out.println("ArrayList using Collection as Reference Type");
		Collection<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(2);
		a1.add(null);
//		for (int a : a1) {
//			System.out.println(a);
//		}
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
		
		
		System.out.println("ArrayList using List as Reference Type");
		List<Integer> a2 = new ArrayList<>();
		a2.add(1);
		a2.add(2);
		a2.add(2);
		a2.add(null);
//		for (int a : a2)
			System.out.println(a2);
		a2.remove(2);
		System.out.println(a2);
		a2.remove(2);
		System.out.println(a2);
		
		System.out.println("ArrayList using ArrayList as Reference Type");
		ArrayList<String> a3 = new ArrayList<>();
		a3.add("Hello");
		a3.add("This is");
		a3.add("Rishabh");
		a3.add("Rishabh");
		for (String a : a3)
			System.out.println(a);
		a3.remove(1);
		System.out.println(a3);
	}

}
