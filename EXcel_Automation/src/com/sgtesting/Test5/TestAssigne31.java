package com.sgtesting.Test5;

import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;

public class TestAssigne31 {
	public static void main(String[] args) {
		immutable();

	}
	private static void immutable()
	{
		String s1=new String("java");
		System.out.println(s1);
		s1.concat(" Programming");
		System.out.println(s1);
		System.out.println("++++++++");
		StringBuffer s2=new StringBuffer("java");
		System.out.println(s1);
		s2.append("Programming");
	     System.out.println(s2);

	}
	{

	}

}
