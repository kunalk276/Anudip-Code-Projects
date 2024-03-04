package demoClass;

import java.util.Scanner;

public class CharToAscii {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a character:");
	        
	        char ch = scanner.next().charAt(0);              //  for Read character entered by the user

	        int asciiValue = (int) ch;						 // for Convert character to its ASCII value

	        
	        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

	       
	    
	}

}
