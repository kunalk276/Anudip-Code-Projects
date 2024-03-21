package com.collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeueExample 
{
    public static void main(String[] args) 
    {
        
        Deque<Integer> deque = new LinkedList<>();   // <int , String , ..> -- Generic Collection

        deque.addFirst(33);     // Adding elements to the front of the dequeue
        deque.addFirst(22);
        deque.addFirst(11);

        deque.addLast(41);      // Adding elements to the end of the dequeue
        deque.addLast(51);
        deque.addLast(61);

        System.out.println("Deque elements: " + deque);

        int firstElement = deque.removeFirst();      // Removing elements from front of dequeue
        System.out.println("Removed first element: " + firstElement);

        int lastElement = deque.removeLast();        // Removing elements from end of dequeue
        System.out.println("Removed last element: " + lastElement);

        System.out.println("Updated deque: " + deque);   

        int first = deque.getFirst();       // Accessing elements from front of the dequeue
        System.out.println("First element: " + first);

        int last = deque.getLast();         // Accessing elements from end of the dequeue
        System.out.println("Last element: " + last);

        int peekFirst = deque.peekFirst();      // Peeking elements from front
        System.out.println("Peek first element: " + peekFirst);

        int peekLast = deque.peekLast();        // Peeking end of the dequeue
        System.out.println("Peek last element: " + peekLast);
        
        
        iterateDeque(deque);
    }

    	
    public static void iterateDeque(Deque<Integer> deque)
    {																// Iterating using Iterator
        System.out.println("Iterating over Deque:");			
        Iterator<Integer> iterator = deque.iterator();	
        while (iterator.hasNext()) 									
        {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}



