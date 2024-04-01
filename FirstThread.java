//*MultiThreading*
// 1. Application -- design to perform a specific task
//2. process -- process is an instance of a program that is being executed or processed. // process can have multiple thread.
//3. Thread-- smallest executable unit of a process
// Multitasking --  an operation which multiple task at a time    a single program can perform two or more tasks simultaneously

package com.threaddemo;  

public class FirstThread 
{  
	
		
	public static void main(String args[])  // JVM start with main method   // start the execution
	{  
		for(int i=0; i<=5;i++)   //first thread start  // all the task will be perform inside main method
		{
			System.out.println(i);
		}
	}  
}  
