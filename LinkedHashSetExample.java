package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();   // <int , String , ..> -- Generic Collection

        
        linkedHashSet.add("Sagar");
        linkedHashSet.add("Rajan");
        linkedHashSet.add("Rohit");
        linkedHashSet.add("Shivraj");
        linkedHashSet.add("Kunal"); 
        linkedHashSet.add("Kunal");       // Adding a duplicate element
        linkedHashSet.add("Avinash");

        System.out.println("LinkedHashSet elements: " + linkedHashSet);

       
        linkedHashSet.remove("Avinash");				 // Removing element

        System.out.println("LinkedHashSet elements after removing Avinash: " + linkedHashSet);

       
        System.out.println("Rohit is present ? " + linkedHashSet.contains("Rohit")); 		// Checking element is present

        
        System.out.println("Size of the LinkedHashSet: " + linkedHashSet.size());        // Size of LinkedHashSet

        // Iterating LinkedHashSet using Iterator
        
        System.out.println("Iterating through the LinkedHashSet:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        // Clearing the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("Is the LinkedHashSet empty? " + linkedHashSet.isEmpty());
    }
}
