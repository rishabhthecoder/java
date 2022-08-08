package com.List;
import java.util.*;

public class Vectors {
public static void main(String arg[]) {
	Vector<Integer> v1=new Vector<>();
	v1.addElement(4);
	v1.add(3);
	v1.addElement(6);
	v1.add(5);
	for(int i:v1) {
		System.out.println(i);
	}
	System.out.println(v1);
	v1.remove(0);
	System.out.println(v1);
}
}
