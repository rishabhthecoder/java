package com.generics.genric;

import java.util.ArrayList;

public class MyCustomList<T> {
	ArrayList<T> arrayList = new ArrayList<>();

	public void addElement(T a) {
		arrayList.add(a);
	}
	public void removeElement(T a) {
		arrayList.remove(a);
	}
	
	public T getIndex(int index) {
		return arrayList.get(index);
	}
	public void setArrayList(ArrayList<T> arrayList) {
		this.arrayList = arrayList;
	}
	@Override
	public String toString() {
		return "MyCustomList [arrayList=" + arrayList + "] "+arrayList.get(0).getClass();
	}
	public void getInstance() {
		// TODO Auto-generated method stub
		if(arrayList.get(0) instanceof Integer) {
			System.out.println(arrayList+" is of type Integer");
		}
		else 
			System.out.println(arrayList+ " is of type "+ arrayList.get(0).getClass());
		//return null;
	}
	
}
