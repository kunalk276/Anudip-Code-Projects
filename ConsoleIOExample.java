package com.iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIOExample 
{

	public static void main(String[] args) throws IOException 
	{																		// Final class cannot be extends
		System.out.println("Enter a String");
		
		InputStreamReader isr=new InputStreamReader(System.in);   //object of InputStreamReader   // data of system send to irs object
		
		BufferedReader in=new BufferedReader(isr);
		
		String line;
		while ((line = in.readLine()) != null && (line.length() != 0))
		{
			System.out.print("You Entered " +line);
		}
		
		
	}

}
