package com.map;
import java.util.*;
public class LinkedHAshMap {
	public static void main(String arg[]) {
		LinkedHashMap<Integer,Integer> lhm1=new LinkedHashMap<>();
		lhm1.put(1,5);
		lhm1.put(3,3);
		lhm1.put(2, 2);
		lhm1.put(new Integer(1), 6);
		System.out.println(lhm1);
	}

}
