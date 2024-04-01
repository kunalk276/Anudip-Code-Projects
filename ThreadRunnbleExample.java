//Thread by implementing Runnable Interface

package com.threaddemo;

class Thread1 implements Runnable   // runnable implements for Thread1 a Run Method
{
	@Override
	public void run()   // Overriding run method
	{
		for(int i=0; i<=5;i++)
		{
			System.out.println("Thread 1 = "+i);
		}
	}
}

class Thread2 implements Runnable   // runnable implements for Thread1 a Run Method
{

	@Override
	public void run()   // Overriding run method
	{
		for(int i=0; i<=5;i++)
		{
			System.out.println("Thread 2 = "+i);
		}
	}

}

public class ThreadRunnbleExample 
{

	public static void main(String[] args) 
	{
	  Thread1 t1=new Thread1();  //object of a Thread1 class  t1
	  Thread2 t2=new Thread2();  // object of a Thread1 class  t2 
	 
	  Thread t=new Thread(t1);  // Reference of a Thread1 class to access thread object t
	  Thread tt=new Thread(t2); // Reference of a Thread2 class to access thread object tt
	 
	  t.start();   
	  tt.start();
	  
	  System.out.println("This in main method Executed");
	  
	  
	  
	}

}
