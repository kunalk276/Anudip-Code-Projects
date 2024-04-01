package com.threaddemo;


public class Account  extends Thread
{
	static int balance=1000;
	
	public void run()
	{
		synchronized (Account.class)
		{
		if(balance>800)
		{
			System.out.println(Thread.currentThread().getName()+" Your Balance is "+balance+" Rupees U can Withdrawal the amount...");
			try
			{
			sleep(2000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			balance=200;
			
			System.out.println("After withdrawal your balance is"+balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" Your Balance Is "+balance+" So You cant Withdrawal the amount");
		}
		}
	}
	
}
