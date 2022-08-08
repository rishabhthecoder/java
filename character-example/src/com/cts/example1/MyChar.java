package com.cts.example1;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		super();
		this.ch = ch;
	}

	public boolean isVowel() {
		// TODO Auto-generated method stub
		if(ch=='a'||ch=='A')
			return true;
		else if(ch=='e'||ch=='U')
			return true;
		else if(ch=='i'||ch=='U')
			return true;
		else if(ch=='o'||ch=='U')
			return true;
		else if(ch=='u'||ch=='U')
			return true;
		return false;
	}

	public boolean isDigit() {
		// TODO Auto-generated method stub
		if(ch>=48 && ch<=57)//between '0' and '9'
			return true;
		
		return false;
	}

	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		if((ch>=97 && ch<=122)||(ch>=65 && ch<=90))//between 'a' to 'z' or 'A' to 'Z'
			return true;
		
		return false;
	}

	public boolean isConsonent() {
		// TODO Auto-generated method stub
		if(isAlphabet()&& !isVowel())
			return true;
		return false;
	}

	public static void printLowerCaseAlphabet() {
		// TODO Auto-generated method stub
		for(char ch=97 ;ch<=122;ch++)
			System.out.print(ch+" ,");
		
	}

	public static void printUpperCaseAlphabet() {
		// TODO Auto-generated method stub
		for(char ch=65 ;ch<=90;ch++)
			System.out.print(ch+" ,");
	}

}
