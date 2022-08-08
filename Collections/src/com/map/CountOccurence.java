package com.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class SortMapByValue implements Comparator<Character> {
	Map<Character, Integer> map;

	public SortMapByValue(Map<Character, Integer> map) {
		this.map = map;
	}

	@Override
	public int compare(Character o1, Character o2) {
		// TODO Auto-generated method stub
		// System.out.println(o1);
		// return Integer.compare(map.get(o1), map.get(o2));
		if (map.get(o1) >= map.get(o2))
			return 1;
		else
			return -1;
	}
}

class SortMapByKey implements Comparator<Character> {

	@Override
	public int compare(Character o1, Character o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}

public class CountOccurence {
	public static void main(String arg[]) {
		String string = "This my laptop and I am a software enginer in cognizant";
		Map<Character, Integer> occurences = new HashMap<>();

		char[] c = string.toCharArray();
		for (char ch : c) {
			if (occurences.containsKey(ch))
				occurences.put(ch, occurences.get(ch) + 1);
			else
				occurences.put(ch, 1);
		}
		// System.out.println(new SortMap());
		System.out.println("HashMap:-\t" + occurences);
		Map<Character, Integer> treeMapSortByKey = new TreeMap<>(new SortMapByKey());
		treeMapSortByKey.putAll(occurences);
		System.out.println("Sorted tree map by key:- \t" + treeMapSortByKey);
		Map<Character, Integer> treeMapSortByValue = new TreeMap<>(new SortMapByValue(occurences));
		treeMapSortByValue.putAll(occurences);
		System.out.println("Sorted tree map by Value:- \t" + treeMapSortByValue);
		int min = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (treeMapSortByValue.containsValue(i)) {
				min = i;
				break;
			}
		}
		
		System.out.println(treeMapSortByValue+" "+min);

	}
}
