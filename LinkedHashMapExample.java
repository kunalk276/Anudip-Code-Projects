package com.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample 
{

	public static void main(String[] args) 
	{

		LinkedHashMap<Integer, String> lh=new LinkedHashMap<Integer, String>();    // Generic Collection
		
		lh.put(1, "Kunal");
		lh.put(11, "Rajan");
		lh.put(17, "Karan");
		lh.put(19, "Rohit");
		lh.put(13, "Sahil");
		lh.put(14, "KK");
		lh.put(34, "Sagar");
		lh.put(43, "Kunal");
		lh.put(null, null);      // 1 null key is accepted    
		
		lh.put(7, null);		 // multiple  null valued can allowed
		
		lh.put(9, "Rohit");     // Multiple value can allowed
		
		System.out.println(lh);

	}

}
