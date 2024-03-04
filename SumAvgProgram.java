
/* Write a program in Java to input 5 numbers from the keyboard and find their sum and average. */


package kunal;

import java.util.Scanner;

public class SumAvgProgram {

	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter First number : ");
	        int a=sc.nextInt();
	        System.out.println("Enter Second number : ");
	        int b=sc.nextInt();
	        System.out.println("Enter Third number : ");
			int c=sc.nextInt();
			System.out.println("Enter Fourth number : ");
			int d=sc.nextInt();
			System.out.println("Enter Fifth number : ");
			int e=sc.nextInt();
			
			int sum= a+b+c+d+e;
			int avg= (a+b+c+d+e)/5;
			
		
			System.out.println("Sum of all Numbers is : "+sum);
			
			
			System.out.println("Average of all Numbers is : "+avg);
		
	}

}
