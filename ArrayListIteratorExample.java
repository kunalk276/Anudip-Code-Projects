package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class ArrayListIteratorExample 
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("ONE");
		
		list.add("TWO");
		
		list.add("THREE");
		
		
		//traversing list elements using Iterator 
		
		Iterator iterator= list.iterator();
	}

}
