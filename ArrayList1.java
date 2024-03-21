package com.collections;

import java.util.ArrayList;

public class ArrayList1
{

	public static void main(String[] args) 
	{
		
		ArrayList list=new ArrayList();
		
		list.add(5);
		list.add("KUNAL");
		list.add(3.14f);
		list.add(true);
		list.add(0);
		list.add('e');
		list.add(7);
		
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("one");		//0
		list2.add("Two");		//1
		list2.add("Three");		//2
		list2.add("Four");      //3
		
		System.out.println(list2.size());   // output =4
		
		list2.remove("Two");
		
		System.out.println(list2.size());   // output =2
		
		list2.add(1,"Three");   // add value at index 1
		
		System.out.println(list);
		
		System.out.println(list2);
	}

	

	
}
