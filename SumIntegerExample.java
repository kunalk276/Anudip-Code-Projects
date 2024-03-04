package demoClass;

import java.util.Scanner;

public class SumIntegerExample {
	
		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter an integer:");
	        int number = scanner.nextInt();

	        int sum = sumOfDigits(number);
	        System.out.println("The sum of digits of " + number + " is: " + sum);

	        
	    }

	    public static int sumOfDigits(int number) {
	        
	    	
	    	int sum = 0;

	                                     

	        while (number > 0) {
	            
	            int digit = number % 10;         // for extract the last digit
	            						
	            sum += digit;					// Adding digit to the sum

	            
	          
	            number /= 10;                 //  for Remove the last digit
	        }

	        return sum;
	    }
	}


