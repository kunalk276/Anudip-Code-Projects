package com.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample 
{

	public static void main(String[] args) throws IOException     // throws Exception when file not found
	{
		File file = new File("input.txt");   // object of a File  input.txt file
		BufferedReader br=new BufferedReader(new FileReader(file));   // Buffered reader for input reading of File

		String str;
		while ((str=br.readLine())!=null)  // condition for string is not null
		{
			System.out.println(str);
		}
		br.close();
	

	}
}
