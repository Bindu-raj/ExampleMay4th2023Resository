package com.sgtesting.Test5;

public class TestAssigne {

	public static void main(String[] args) {
       System.out.println(question());
	}
	private static StringBuffer question()
	{
		StringBuffer s=new StringBuffer("java Language");
		StringBuffer sa=s.insert(5,"programming");
		
		return sa;
	}

}
