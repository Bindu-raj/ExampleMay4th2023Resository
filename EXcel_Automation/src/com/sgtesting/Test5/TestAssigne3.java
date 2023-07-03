package com.sgtesting.Test5;
class Employee
{
	String firstName;
	int age;
	Employee(String fn,int age)
	{
		this.firstName=fn;
		this.age=age;
	}
	public String toString()
	{
		return "First Name of Student is"+firstName+"and age is"+age;
		
	}
}
public class TestAssigne3 {
	public static void main(String[] args) {
Employee o1=new Employee("Raju",20);
System.out.println(o1);
	}

}
