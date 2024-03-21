package com.collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();     // <int , String , ..> -- Generic Collection

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(27);
        list.add("Kunal");
        list.add("Kadam");
        list.remove(3);
        list.get(5);
        list.getFirst();
        list.getLast();

        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(11);
        list2.add(21);
        list2.add(31);

        System.out.println(list2);
        
        
        iterateLinkedList(list);                    // Call the method to iterate
    }

    
    public static void iterateLinkedList(LinkedList<Object> list)               // Method to iterate over the linked list
    {
        System.out.println("Iterating over LinkedList:");
        for (Object element : list) 
        {
            System.out.println(element);
        }
    }
    

    public static void demonstratePeekAndElement(LinkedList<Object> list) {
        System.out.println("Peek: " + list.peek());                      // Peek method retrieves  head of the list without removing it
        System.out.println("Element: " + list.element());                // Element method retrieves the head of the list without removing it and throws NoSuchElementException if the list is empty
    }
}



