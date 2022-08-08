package com.set;

import java.util.HashSet;

public class HAshSet {
	public static void main(String arg[]) {
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(10);
		hs1.add(2);
		hs1.add(30);
		hs1.add(30);
		System.out.println(hs1);
		hs1.remove(10);
		System.out.println(hs1);
		// no proper order of insertion of element in hashset
		HashSet<String> hs2=new HashSet<>();
		hs2.add("Rishabh1");
		hs2.add("name2");
		hs2.add("is name3");
		hs2.add("Rishabh1");
		System.out.println(hs2);
	}

}
