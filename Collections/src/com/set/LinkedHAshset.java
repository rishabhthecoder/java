package com.set;

import java.util.LinkedHashSet;

public class LinkedHAshset {
	public static void main(String arg[]) {
		LinkedHashSet<Integer> ls1 = new LinkedHashSet<>();
		ls1.add(10);
		ls1.add(2);
		ls1.add(30);
		ls1.add(30);
		System.out.println(ls1);
		ls1.remove(2);
		System.out.println(ls1);


		LinkedHashSet<String> lhs2=new LinkedHashSet<>();
		lhs2.add("Rishabh1");
		lhs2.add("name2");
		lhs2.add("is name3");
		lhs2.add("Rishabh1");
		System.out.println(lhs2);
	}

}
