package com.generics.genric;

import java.util.Collections;
import java.util.List;

public class GenericRunner {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static <X> X doubleValue(X doo) {
		return doo;
	}

	public static void main(String arg[]) {
		MyCustomList<Integer> myCustomList1 = new MyCustomList<>();
		MyCustomList<String> myCustomList2 = new MyCustomList<>();
		// MyCustomList<T> myCustomList3=new MyCustomList<>();

		myCustomList1.addElement(Integer.valueOf(5));
		myCustomList1.addElement(Integer.valueOf(3));
		// myCustomList1.addElement(String.valueOf(5));
		myCustomList2.addElement("5");
		myCustomList2.addElement("uiy");
		myCustomList2.addElement("poi");
		System.out.println("get value at position 2 :-  " + myCustomList2.getIndex(2));
		System.out.println(myCustomList1);
		System.out.println(myCustomList2);
		System.out.println(doubleValue(myCustomList1));
		myCustomList2.getInstance();
	}

}
