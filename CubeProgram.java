
/* Write a Java program to display the cube of the given number up to an integer. */


package kunal;

import java.util.Scanner;

public class CubeProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number : ");
        int a=sc.nextInt();
        
        int cube= (a*a*a);
		
		
		System.out.println("Cube of all Numbers is : "+cube);

        
		
	}

}
