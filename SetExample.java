
// No duplicate Value  It will Skip the value added

package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample 
{

	public static void main(String[] args)
	{
		Set set = new LinkedHashSet();
		
		set.add(1);
		set.add(12);
		set.add(15);
		set.add(11);
		set.add("S");
		set.add("Kunal");
		set.add(3.14);
		set.add(true);
		set.add(null);   // It does not allow Multiple NULL value
		set.add(0);
		set.add(1);     // It does not Allowed the value Again in a set  
		
		System.out.println(set);
		
		System.out.println(set.remove("S"));
		
		System.out.println(set.size());
		
		System.out.println(set.isEmpty());
		
		System.out.println(set.contains(set));
		
		// Second set 
		
		Set set1=new LinkedHashSet();
		
		
		set1.add("ROHIT");
		set1.add("SAGAR");
		set1.add(4.11);
		set1.add(true);   
		
		set1.add(null);   // It does not allow Multiple NULL value
		set1.add(5);
		set1.add(11);      // It does not allow Multiple NULL value
		
		System.out.println(set1);
		
		System.out.println(set.addAll(set1));    // Combine the TwoSet   // if the two set have same element the combined set does not contain same element 
		
		System.out.println(set);    // Output of combined
		
		
	
        Iterator<Object> iterator = set.iterator();      	// Using Iterator to iterate over the set
        while (iterator.hasNext()) 
        {
            Object element = iterator.next();
            System.out.println(element);
        }
	}

}
