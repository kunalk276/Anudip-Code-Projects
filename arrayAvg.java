
// Write a Java program to calculate the average value of array elements.

package kunal;

import java.util.Scanner;

public class arrayAvg {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array :");
		
		int[] numbers=new int[sc.nextInt()];
		int sum=0;
		int avg=0;
		
		System.out.println("Enter "+numbers.length+ " elements of array :");
		for (int i=0;i<numbers.length;i++)
		{
			

		numbers[i]=sc.nextInt();
		sum=numbers[i]+sum;
		 avg =sum/numbers.length;
		}
		//System.out.println("Sum of all array elements is :"+sum);

		System.out.println("Avg of all array elements is :"+avg);
	}

}
