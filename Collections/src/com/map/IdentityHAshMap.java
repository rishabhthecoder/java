package com.map;

import java.util.*;

public class IdentityHAshMap {
	public static void main(String arg[]) {
		Map<Integer, Integer> ihm1 = new IdentityHashMap<>();
		ihm1.put(1, 1);
		ihm1.put(new Integer(1), 2);
		ihm1.put(new Integer(1), 7);
		System.out.println(ihm1);
	}

}
