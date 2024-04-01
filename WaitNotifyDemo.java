package com.threaddemo;

class Customer
{
	int amount=10000;
	
	synchronized void withdraw(int amount)     // amount is a instance variable here
	{
		System.out.println("Going to Withdraw....");
	
		if(this.amount<amount)   // withdraw if amount is less than current (.this)
		{
			System.out.println("Less balnce; Waitnig for deposit....");
			try 
			{
				wait();  // put wait in a try block
			}
			catch(InterruptedException e)  // handle exception
			{
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println(Thread.currentThread().getName()+ " "+this.amount);
		System.out.println("Withdraw Completed");
			
	}
	
	void deposit(int amount)  
	{
		System.out.println("withdraw amount...");
		
		this.amount=this.amount+amount;      //deposit amount in the current amount(.this)
		System.out.println(Thread.currentThread().getName()+ " "+this.amount);
	}
}

public class WaitNotifyDemo 
{

	public static void main(String[] args) 
	{
		 Customer cust =new Customer();   //object of customer
		
		new Thread()  //Instance of Thread class 1    // anonymous function
		{
			
			public void run()
			{
				
				cust.withdraw(5000);
				
			}
		}.start();
		
		new Thread()   // Instance of thread class 2
		{
			public void run()
			{
				cust.deposit(50000);
			}
		}.start();
		
	}

}
