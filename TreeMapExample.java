package com.collections;

import java.util.TreeMap;


public class TreeMapExample 
{

	public static void main(String[] args) 
	{
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();  // Generic Collection
		
		tm.put(12, "Car");
		tm.put(2, null);     // Value can be null
		tm.put(4, "Bike");
		tm.put(6, "Truck");
		tm.put(14, "Tractor");
		tm.put(17, "Tractor");   // duplicate vale can be allowed
		
		//tm.put(14, "JCB");    // latest value can print when duplicate key
		
		tm.put(3, null);		// Multiple Null Values can accepted
		
		//tm.put(null, "Trolley");   // Key cannot be a null 
		
		System.out.println(tm);

	} 

}


