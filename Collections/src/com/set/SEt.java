package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SEt {
	public static void main(String arg[]) {
		List<Character> lists = new ArrayList<>();
		Collections.addAll(lists, 'A', 'B', 'C', 'Z', 'R', 'E');
		Set<Character> hashSet = new HashSet<>(lists);
		System.out.println("HashSet:- " + hashSet);
		Set<Character> linkedHashSet = new LinkedHashSet<>(lists);
		System.out.println("Linked hash Set:-" + linkedHashSet);
		Set<Character> treeSet = new TreeSet<>(lists);
		System.out.println("Tree Set:-" + treeSet);
	}

}
