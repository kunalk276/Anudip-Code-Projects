package com.threaddemo;

// IMP >----> void sample(); //only one abstract method allowed   // If the class does not have body and  in last semicolon the this is a abstract class without declare a abstract method


// creating thread by extending thread class   // ThreadOne is also Thread
class ThreadOne extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thread ONE "+i);
		}
	}
}

// ThreadTwo is also Thread
class ThreadTwo extends Thread   // thread Implements Run method From Runnable Interface     its need to run method 
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thread TWO "+i);
		}
	}
}


public class ThreadJava       // ThreadJava is also Thread    //main thread
{
	
	public static void main(String[] args) 
	{
		ThreadOne t1=new ThreadOne();    // new State // object created of thread
		ThreadTwo t2=new ThreadTwo();    // new State // object created of thread
		
		t1.start();  //Runnable  
		
		//t1.start();  // ERROR >--->  Illegal State ---> never start same Thread Twice 
		
		t2.start();  //Runnable     
		
		
		System.out.println("This in main method Executed");

	}

}

/* Thread Life Cycle >--> New -->Runnable -->Running -->Blocked/Waiting -->Dead */
