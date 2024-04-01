package com.threaddemo;


class SleepDemo extends Thread      //  SleepDemo thread class extending Thread
{
    @Override
    
    public void run()    // Override the run method inherited from Thread
    {
       
        for(int i = 1; i <= 5; i++)     // Loop 
        {
            
            System.out.println(i);  // Print the value of i
            
            try 
            {
               
                sleep(1000);     // Put current thread to sleep for (1 second)
            } 
            catch (InterruptedException e) 
            {
               
                e.printStackTrace();    // Print the stack trace if InterruptedException occurs
            }
        }
    }
}


public class ThreadSleepExample   // Main class
{
    
    public static void main(String[] args)     // Main method >---> entry point of the program
    {
        
        SleepDemo sl = new SleepDemo();     // Create instance of SleepDemo
        
        sl.start();    // Start the thread
    }
}
