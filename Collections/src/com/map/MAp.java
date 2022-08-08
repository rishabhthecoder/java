package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAp {

	public static void main(String arg[]) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("cd", 2);
		hashMap.put("ab", 1);
		hashMap.put("eeew", 56);
		hashMap.put("32", 76);
		System.out.println("Hash map:-\t" + hashMap);
		Map<String, Integer> linkedhashMap = new LinkedHashMap<>();
		linkedhashMap.put("cd", 2);
		linkedhashMap.put("ab", 1);
		linkedhashMap.put("eeew", 56);
		linkedhashMap.put("32", 76);
		System.out.println("LinkedHashMap:-\t" + linkedhashMap);
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("cd", 2);
		treeMap.put("ab", 1);
		treeMap.put("eeew", 56);
		treeMap.put("32", 76);
		System.out.println("tree map:-\t " + treeMap);
		
//		String string = "This my laptop and I am a software enginer in cognizant";
//		Map<Character, Integer> occurences = new HashMap<>();
//		char[] c = string.toCharArray();
//		for (char ch : c) {
//			if (occurences.containsKey(ch))
//				occurences.put(ch, occurences.get(ch) + 1);
//			else
//				occurences.put(ch, 1);
//		}
//		System.out.println(occurences);
	}
}
