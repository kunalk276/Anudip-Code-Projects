package com.threaddemo;


public class MainThreadExample     // Main class
{

    
    public static void main(String[] args)     // Main method >---> entry point of the program
    {

        
        System.out.println(Thread.currentThread().getName());   // Print name of current thread (main thread)

        // priority levels of threads
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        
       
        System.out.println(Thread.currentThread().getPriority());      // Print priority of current thread (main thread)
    }
}
