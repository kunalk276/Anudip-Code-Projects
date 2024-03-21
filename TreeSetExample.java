package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample 
{
    public static void main(String[] args) 
    {
        
        TreeSet treeSet = new TreeSet();

        
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(4);

        
        System.out.println("TreeSet elements: " + treeSet);          // Displaying the TreeSet

        
        treeSet.add(5);												// Adding a duplicate element 

        System.out.println("TreeSet after adding duplicate: " + treeSet);        // after adding duplicate element

        
        treeSet.remove(8);														// Removing element from  TreeSet
        
        System.out.println("TreeSet elements after removing 8: " + treeSet);	// after removing an element

       
        System.out.println("Is 3 present in the TreeSet? " + treeSet.contains(3));        // Checking element is present in TreeSet

       
        System.out.println("Size of the TreeSet: " + treeSet.size());					 // Getting the size of the TreeSet

        	// TreeSet using Iterator
        
        System.out.println("Iterating through the TreeSet:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
        
        treeSet.clear();			// Clearing the TreeSet

        
        System.out.println("Is the TreeSet empty? " + treeSet.isEmpty());          // Checking if the TreeSet is empty
    }
}
