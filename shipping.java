package kunal;

import java.util.Scanner;

public class shipping {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Chooose Your Shipping Method...");
		System.out.println("1.standard");
		System.out.println("2.Express");
		System.out.println("3.OverNight");
		
		
		int shipping= sc.nextInt();
		int basecost=10;
		switch(shipping)
		{
		
		case 1:
			   System.out.println("You choose the Standard shipping 1...");
			   basecost=10;
			   break;
			   
		case 2:
			   System.out.println("You choose the Express shipping ...");
			   basecost=20;
			   break;
		case 3:
			   System.out.println("You choose the OverNight shipping ...");
			   basecost=30;
			   break;
		
		default:
			   System.out.println("Please select from above...");
			   
			   break;
		
		}
		
		

	}

}
