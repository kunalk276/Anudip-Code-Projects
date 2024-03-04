
/* Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name. */


package kunal;

import java.util.Scanner;

public class SwitchCaseDayProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number betweeen 1 to 7 :");
		int a=sc.nextInt();
		
		switch(a) {
		
		case 1:
			   System.out.println("MONDAY");
			  
			   break;
			   
		case 2:
			   System.out.println("TUESDAY");
			  
			   break;

			   
		case 3:
			   System.out.println("WEDNESDAY");
			  
			   break;

			   
		case 4:
			   System.out.println("THURSDAY");
			  
			   break;

			   
		case 5:
			   System.out.println("FRIDAY");
			  
			   break;

			   
		case 6:
			   System.out.println("SATURDAY");
			  
			   break;

			   
		case 7:
			   System.out.println("SUNDAY");
			  
			   break;

			   
		default:
			   System.out.println(" Please enter 1 to 7  numbers ");
			  
			   break;

		
		
		}
		

	}

}
