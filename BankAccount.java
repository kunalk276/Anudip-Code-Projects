package oops;

public class BankAccount {

	public String accountNumber;
	public double balance;
	
	public BankAccount(String accountNumber, double balance)
	{
		super();
		this.accountNumber= accountNumber;
		this.balance=balance;
	}
			
	public void withdraw(double amount)
	{
		if (balance >= amount)
		{
			balance -= amount;
			
		}
		else
		{
			System.out.println("INSUFFICIENT BALANCE.....!");
		}
	}
	public double getBalance()
	{
		return balance;
	}
}
