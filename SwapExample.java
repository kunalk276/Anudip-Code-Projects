package demoClass;
import java.util.*;


public class SwapExample {

	public void swapFunction(int a , int b)
	{
		int temp ;
		
		temp= a; 
		
		a = b; 
		
		b=temp;
		
		System.out.println("After Swap Values ARE FOLLOWING : ");
		
		System.out.println("Value of A is  : "+a);
		System.out.println("Value of B is  : "+b);
		
	}
	
	public static void main(String[] args) {
		SwapExample se = new SwapExample();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value a: ");
		int a=sc.nextInt();
		
		System.out.println("Enter a value b: ");
		int b=sc.nextInt();
		
		se.swapFunction(a,b);    // Calling swap method  
		
		
		
		
	}

}
