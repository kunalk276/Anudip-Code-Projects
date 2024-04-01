package com.threaddemo;

class WaitNotify extends Thread 
{
    private static final Object lock = new Object();
    @Override
    public void run() 
    {
        synchronized (lock) 
        {
            for (int i = 11; i <= 51; i++) 
            {
                System.out.println(i);
                try 
                {
                    lock.wait(); // Wait until notified
                } catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public void fill() 
    {
        synchronized (lock) 
        {
            lock.notify(); // Notify waiting thread
        }
    }
}

public class WaitNotifyExample 
{
    public static void main(String[] args) 
    {
    	WaitNotify sl = new WaitNotify();
        sl.start();

        // Sleep added to ensure that the thread starts waiting before fill is called
        try 
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        sl.fill(); // Fill the resource
    }
}
