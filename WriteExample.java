//Taking input from Java
// IO class belongs to IO package 
// Known strings
package com.iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample 
{

	public static void main(String[] args) throws IOException     // throws Exception when file not found
	{
		File file = new File("input.txt");   // object of File  &  path of external file input.txt  for write
		
		String str= "copy this string to file ";  //Write the following string into input.txt file
		
		FileWriter filew = new FileWriter(file);      // object of FileWriter

		filew.write(str);    // Write method for  String writing
		filew.close();		// close the file after write for next time 
	}

}
 