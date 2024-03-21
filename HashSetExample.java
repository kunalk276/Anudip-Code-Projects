package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hashSet = new HashSet<>();            // <int , String , ..> -- Generic Collection

        
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(5);  // Adding a duplicate element

        System.out.println("HashSet elements: " + hashSet);

       
        hashSet.remove(8);       // Removing element

        System.out.println("HashSet elements after removing 8: " + hashSet);

        
        System.out.println("Is 3 present in the HashSet? " + hashSet.contains(3));   // Checking element is present

        
        System.out.println("Size of the HashSet: " + hashSet.size());     // Getting size of the HashSet

        // Iterating HashSet using an Iterator
        System.out.println("Iterating through the HashSet:");
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

       
        hashSet.clear();
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());
    }
}
