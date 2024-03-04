package demoClass;

import java.util.Scanner;


public class AddBinaryNumber {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first binary number: ");
	        String binary1 = scanner.nextLine();

	        System.out.println("Enter the second binary number: ");
	        String binary2 = scanner.nextLine();

	        String sum = addBinary(binary1, binary2);
	        System.out.println("The sum of " + binary1 + " and " + binary2 + " is: " + sum);

	        scanner.close();
	    }

	    public static String addBinary(String binary1, String binary2) {
	        StringBuilder result = new StringBuilder();
	        int carry = 0;

	        int i = binary1.length() - 1;         // Starting from rightmost digits of both binary strings

	        int j = binary2.length() - 1;

	        while (i >= 0 || j >= 0 || carry > 0) {        // loop the two strings until carry is zero

	        	
	            int bit1 = i >= 0 ? Character.getNumericValue(binary1.charAt(i--)) : 0;
	            int bit2 = j >= 0 ? Character.getNumericValue(binary2.charAt(j--)) : 0;

	            int sum = bit1 + bit2 + carry;                     // Calculating  sum of bits and carry

	            result.insert(0, sum % 2);
	            
	            carry = sum / 2;                                 // Update carry for next calculation
	        }

	        return result.toString();
	    }
	}


