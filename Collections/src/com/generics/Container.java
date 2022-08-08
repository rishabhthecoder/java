package com.generics;

public class Container<T extends Number> {
	T value;
	public void show() {
		System.out.println(value.getClass().getName());
	}
}
