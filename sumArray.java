//Write a Java program to sum values of an array.

package kunal;

import java.util.Scanner;

public class sumArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array :");
		
		int[] numbers=new int[sc.nextInt()];
		int sum=0;
		
		
		System.out.println("Enter "+numbers.length+ " elements of array :");
		for (int i=0;i<numbers.length;i++)
		{
			

		numbers[i]=sc.nextInt();
		sum=numbers[i]+sum;
		}
		
		System.out.println("Sum of all array elements is :"+sum);
	}
}