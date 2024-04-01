package com.threaddemo;

class Kunal extends Thread
{
	public void run()
	{
		System.out.println("This is my Task-1..");
	}
	

}

class Adi extends Thread
{
	public void run()
	{
		System.out.println("This is my task-2..");
	}
}

public class ThreadExampleDemo 
{

	public static void main(String[] args) 
	{
		Kunal kk=new Kunal();
		
		kk.start();
		kk.setName("KUNAl");
		kk.setPriority(1);
		String name= kk.getName();
		System.out.println(kk.getName());
		System.out.println(kk.getPriority());
		
		
		Adi ak=new Adi();
		ak.start();
		ak.setName("ADI");
		ak.setPriority(2);
		String name2= ak.getName();
		System.out.println(ak.getName());
		System.out.println(ak.getPriority());

		
		
	}

}
