package com.set;

import java.util.TreeSet;

public class TreESet {
	public static void main(String arg[]) {
		TreeSet<Integer> ts1=new TreeSet<>();
		ts1.add(30);
		ts1.add(10);
		ts1.add(2);
		ts1.add(30);
		System.out.println(ts1);
		ts1.remove(2);
		System.out.println(ts1);
		

		TreeSet<String> ts2=new TreeSet<>();
		ts2.add("Rishabh1");
		ts2.add("name2");
		ts2.add("is name3");
		ts2.add("Rishabh1");
		System.out.println(ts2);
		
	}


}
