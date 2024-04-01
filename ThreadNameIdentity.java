package com.threaddemo;


//Define a thread interface with a single abstract method
interface ThreadInterface 
{
 void sample(); // only one abstract method allowed --> void sample()
 
}


//ThreadThree is also a Thread
class ThreadThree extends Thread 			//Creating threads by extending the Thread class
{
 @Override
 public void run() 
 {
    
     Thread.currentThread().setName("THREE");     // Assign name to the thread
     
     // Print thread identity using Helper Method
     System.out.println("\nThread " + Thread.currentThread().getName() + " with ID " + Thread.currentThread().getId() + " running");
    
    
     for(int i=1; i<=5; i++) 
     {
         System.out.println("Thread THREE "+i);
     }
 }
}

//ThreadFour is also a Thread
class ThreadFour extends Thread 
{
 @Override
 public void run()
 {
    
     Thread.currentThread().setName("FOUR");     // Assign name to the thread
     
     // Print thread identity using Helper Method
     System.out.println("\nThread " + Thread.currentThread().getName() + " with ID " + Thread.currentThread().getId() + " running");
     
     for(int i=1; i<=5; i++) 
     {
         System.out.println("Thread FOUR "+i);
     }
 }
}

public class ThreadNameIdentity      // ThreadNameIdentity is also a Thread (main thread)
{ 
 public static void main(String[] args) 
 {
     // Create instances of ThreadThree and ThreadFour
     ThreadThree t1 = new ThreadThree(); 
     ThreadFour t2 = new ThreadFour(); // New State (object created for thread)

     t1.start(); // Runnable

     t2.start(); // Runnable

     // Assign name to the main thread
     Thread.currentThread().setName("Main Thread");
     
     // Print thread identity  using Helper Method
     System.out.println("\nThread " + Thread.currentThread().getName() + " with ID " + Thread.currentThread().getId() + " running");

     System.out.println("\nThis in main method Executed");
 }
}


