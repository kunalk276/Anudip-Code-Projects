package demoClass;

import java.util.Scanner;

public class RightMostSameExample {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first integer:");
	        int num1 = scanner.nextInt();
	        System.out.println("Enter the second integer:");
	        int num2 = scanner.nextInt();
	        System.out.println("Enter the third integer:");
	        int num3 = scanner.nextInt();

	        boolean result = hasSameRightmostDigit(num1, num2, num3);                
	        System.out.println("Two or more of the integers have the same rightmost digit: " + result);

	        scanner.close();
	    }

	    public static boolean hasSameRightmostDigit(int num1, int num2, int num3) {
	        													
	        int digit1 = num1 % 10;						// for extract rightmost digits
	        int digit2 = num2 % 10;
	        int digit3 = num3 % 10;

	        
	        return digit1 == digit2 || digit1 == digit3 || digit2 == digit3;           //  for check if any two digits are equal
	    
	}

}
