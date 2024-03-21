package com.collections;


import java.util.Vector;
import java.util.Iterator;

public class VectorExample 
{
	 public static void main(String[] args) 
	 {
	        
	        Vector<Integer> vector = new Vector<>();         // <int , String , ..> -- Generic Collection

	        
	        vector.add(10);
	        vector.add(20);
	        vector.add(30);
	        vector.add(40);

	        
	        System.out.println("Vector elements: " + vector);

	        
	        vector.add(2, 25);     // Adding element at a specific index 2

	        
	        System.out.println("Vector elements after adding at index 2: " + vector);       // Displaying after adding an element at index 2

	        
	        vector.remove(1);              // Removing element at a specific index

	        
	        System.out.println("Vector elements after removing at index 1: " + vector);

	        
	        int elementAtIndex3 = vector.get(3);                            // Getting element at a specific index
	        System.out.println("Element at index 3: " + elementAtIndex3);

	        
	        boolean contains40 = vector.contains(40);                       // Checking if an element is present in Vector
	        System.out.println("Does the Vector contain 40? " + contains40);

	       
	        int sizeOfVector = vector.size();									 // Getting size of the Vector
	        System.out.println("Size of the Vector: " + sizeOfVector);

	       
	        // Iterating using Iterator
	        
	        System.out.println("Iterating through the Vector:");
	        Iterator<Integer> iterator = vector.iterator();
	        while (iterator.hasNext())
	        {
	            int value = iterator.next();
	            System.out.println(value);
	        }

	        
	        vector.clear();										// Clearing the Vector

	        
	        boolean isEmpty = vector.isEmpty();
	        System.out.println("Is the Vector empty? " + isEmpty);			// Checking the Vector is empty or not 
	    }
	}
