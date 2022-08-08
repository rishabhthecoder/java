package com.map;

import java.util.TreeMap;

public class TreEMap {
	public static void main(String arg[]) {
		TreeMap<Integer, Integer> tm1 = new TreeMap<>();
		tm1.put(3, 5);
		tm1.put(2, 2);
		tm1.put(1, 4);

		// for(Map<Integer,Integer> k:tm1)
		System.out.println(tm1);
	}

}
