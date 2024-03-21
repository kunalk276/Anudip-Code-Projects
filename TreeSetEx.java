package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx 
{
    public static void main(String[] args)
    {
        TreeSet<Integer> treeSet = new TreeSet<>();        // <int , String , ..> -- Generic Collection

        
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(5); // Adding a duplicate element

        System.out.println("TreeSet elements: " + treeSet);

        // Removing an element from the TreeSet
        treeSet.remove(8);

        System.out.println("TreeSet elements after removing 8: " + treeSet);

        // Checking if an element is present in the TreeSet
        System.out.println("Is 3 present in the TreeSet? " + treeSet.contains(3));

        // Getting the size of the TreeSet
        System.out.println("Size of the TreeSet: " + treeSet.size());

        // Iterating through the TreeSet using an Iterator
        System.out.println("Iterating through the TreeSet:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("Is the TreeSet empty? " + treeSet.isEmpty());
    }
}

