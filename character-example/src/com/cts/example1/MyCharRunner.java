package com.cts.example1;

public class MyCharRunner {

	public static void main(String arg[])
	{
		MyChar myChar =new MyChar('c');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonent());
		MyChar.printLowerCaseAlphabet();
		MyChar.printUpperCaseAlphabet();
	}
}
