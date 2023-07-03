package com.sgtesting.Test5;

public class TestAssigne4 {

	public static void main(String[] args) {
		System.out.println( findposition());
	}
	static int findposition()
	{
		String s=new String("India is the Country of Village");
		int pos1=s.indexOf("Country");
		return pos1;
	}

}
