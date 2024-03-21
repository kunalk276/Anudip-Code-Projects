package com.collections;

import java.util.ArrayList;
import java.util.Collections;

class Customer implements Comparable<Customer>   // 
{
	
	int id;
	String name;
	int amt;
	

     public Customer(int id, String name, int amt)
     {
		super();
		this.id = id;
		this.name = name;
		this.amt = amt;
	}

@Override
public int compareTo(Customer o)   //  CompareTo method one object expect 
{
	if (amt == o.amt)
	{
	    return 0;
	}
	else if (amt > o.amt)
	{
	    return 1;
	}
	else
	{
	    return -1;
	}

}

}


public class ComparatorExample2 
{	

	public static void main(String[] args) 
	{
		ArrayList<Customer> a1=new ArrayList<Customer>(); 
		
		Customer c1=new Customer(1, "manthan", 8000);
		Customer c2=new Customer(2, "Kunal", 3000);
		Customer c3=new Customer(3, "Rajan", 2000);
		Customer c4=new Customer(4, "Rohit", 8000);
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
		
		Collections.sort(a1);
		
		for(Customer c:a1)
		{
			System.out.println(c.id+" "+c.name+" "+c.amt);
		}

	}

}
