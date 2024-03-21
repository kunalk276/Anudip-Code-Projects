// Queue interface extends  Collections interface.
//FIFO
// In This Element add from one end and  deleted from another end
// No *NULL* valve *NOT ALLOWED* can be add It give NullPointer Exception
//Head - ADD , Tail - REMOVE

package com.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample 
{

	public static void main(String[] args) 
	{
		PriorityQueue queue= new PriorityQueue();
		
		queue.add(15);
		try				// Handle the Null Pointer Exception
		{
			queue.add(null);
		}
		catch(NullPointerException ex)
		{
			System.out.println("NULL VALUE NOT ALLOWED");
		}
		
		queue.add(16);
		queue.add(25);
		queue.add(34);
		
		//queue.get(2);
		
		System.out.println(queue);
		
		//System.out.println(queue.poll());  	  // It will give run time error when it not exception handle	//It remove the value from tail last element
		
		
		
		System.out.println(queue.remove());   // It will give exception when not exception handle  //It remove the value from tail last element
		
		System.out.println(queue);
		
//		try				// Handle the No such element Exception
//		{
//			System.out.println(queue.remove());
//		}
//		catch(NoSuchElementException ex)
//		{
//			System.out.println("This object Does not Have any Value");
//		}
		
		
	}

}

