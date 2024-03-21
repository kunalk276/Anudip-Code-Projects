package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapExample
{

	public static void main(String[] args) 
	{
		Map m=new HashMap();
		m.put(3,"KADAM");
		
		HashMap hm=new HashMap();
		m.put(13, "Sagar");
		m.put(20, "Rohit");
		m.put(14, "Mnthan");
		m.put(9, "Rajan");
		m.put(11, "Shivraj");
		
		HashSet set=new HashSet();
		set.add("KUNAL");
		
		
		System.out.println(m.get(13));
		
		System.out.println(m.remove(9));
		
		System.out.println(m.containsKey(20));
		
		System.out.println(m.size());
		
		System.out.println(m.values());
		
		System.out.println(m);
		
		System.out.println(set);
		

	}

}
