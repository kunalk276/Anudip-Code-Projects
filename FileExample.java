package com.iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample 
{

	public static void main(String[] args) throws IOException 
	{
		File f1=new File("input.txt");   // created object of a file f1 and text file input.txt
		File f2=new File("output.txt"); // created object of a file f2 and text file output.txt
		
		FileReader fr=new FileReader(f1);   // file reader object 
		FileWriter fw=new FileWriter(f2);  // file writer object
		 int ch;
		 while((ch= fr.read())!=-1)			// condition reader the file not a negative value 
		 {
			fw.write(ch);
		 }
			fr.close();      
			fw.close();
			System.out.println("File is Copied Sucessfully");
	}

}

//
//package com.iostreams;
//
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class FileExample 
//{
//
//	public static void main(String[] args) throws IOException 
//	{
//		File f1 = new File("input.txt");
//		File f2 = new File("output.txt");
//		
//		FileReader fr =new FileReader(f1);
//		FileWriter fw =new FileReader(f2);
//		
//		int ch;
//		
//		while((ch=fr.read())!=-1)
//		{
//			fw.write(ch);		
//			
//		}
//		
//		fr.close();
//		fw.close();
//		System.out.println("File is Copied");
//		
//	}
//
//}
