package com.map;
import java.util.*;
public class HAshTable {
	public static void main(String arg[]) {
		Hashtable<Integer ,Integer> ht1=new Hashtable<>();// hashtable with default loadFactor of 0.75 and default initial capacity of 11
		Hashtable<Integer ,Integer> ht2=new Hashtable<>(4);// hashtable with default loadfactor of 0.75 and initial capacity of 4
		Hashtable<Integer ,Integer> ht3=new Hashtable<>(4,0.5f);//hashtable with default loadfactor(fill ratio) of 0.5 and initial capacity of 4
		ht1.put(1, 1);
		ht1.put(5, 5);
		//ht1.put(2, 2);
		ht1.put(4, 4);

		ht2.put(1, 1);
		ht2.put(5, 5);
		ht2.put(2, 2);
		ht2.put(4, 4);
		ht2.put(7, 7);
		
		ht3.put(1, 1);
		ht3.put(5, 5);
		//ht3.put(2, 2);
		ht3.put(4, 4);
		
		System.out.println("hashtable with default loadFactor of 0.75 and default initial capacity of 11: \n"+ht1);
		System.out.println("hashtable with default loadFactor of 0.75 and initial capacity of 4:\n"+ht2);
		System.out.println("hashtable with loadFactor of 0.9 and initial capacity of 11:\n"+ht3);
	}
}
