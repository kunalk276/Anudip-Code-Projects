package com.threaddemo;

interface company   // company extends employee
{
	public void salary();
}

class Employee implements company // class employee implements company
{
	public void salary()
	{
		System.out.println("55");
	}
}

class PermentEmp extends Employee
{
	public void salary()
	{
		System.out.println("permenent employee");
	}
}
//
//interface Employee
//{
//	public void salary();
//	public void leaves();
//}

public class MethodOverridingExample 
{

	public static void main(String[] args) 
	{

		Employee emp=new Employee();
		

	}

}
