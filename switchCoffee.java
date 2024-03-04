package kunal;
import java.util.Scanner;
public class switchCoffee {

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Chooose Your Coffee..");
		System.out.println("1.Espresso");
		System.out.println("2.Latte");
		System.out.println("3.Cappucino");
		System.out.println("4.Americano");
		
		int choice= sc.nextInt();
		
		switch(choice)
		{
		
		case 1:
			   System.out.println("You choose the Espresso , Price is 250");
			   
			   break;
			   
		case 2:
			   System.out.println("You choose the Latte , Price is 250");
			   
			   break;
		case 3:
			   System.out.println("You choose the Cappucino , Price is 250");
			   
			   break;
		case 4:
			   System.out.println("You choose the Americano , Price is 250");
			   
			   break;
		default:
			   System.out.println("Please select from above...");
			   
			   break;
		
		}
		

	}

}
