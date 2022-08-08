package com.map;

import java.util.HashMap;

public class HAshMap {
public static void main(String arg[]) {
	HashMap<Integer ,String> hm1=new HashMap<>();
	hm1.put(1,"Rishahb");
	hm1.put(2, "Raghav");
	hm1.put(3, "Rishahb");
	hm1.put(4, "ram");
	System.out.println(hm1.size()+"\n"+hm1);
	
	HashMap<Integer,Integer> hm2=new HashMap<>();
	hm2.put(3, 3);
	hm2.put(5, 5);
	hm2.put(1, 1);
	System.out.println(hm2);
}
}
