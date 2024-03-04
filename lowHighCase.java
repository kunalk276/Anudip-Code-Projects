package kunal;
import java.util.Scanner;
public class lowHighCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabate : ");
        
        String input= sc.next().toLowerCase();
        
        boolean upperCase = input.charAt(0) >= 65 && input.charAt(0) <=90;
        boolean lowerCase = input.charAt(0) >= 97 && input.charAt(0) <=122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")||
        		input.equals("o") || input.equals("u");
        
        if(input.length()>1)
        {
        	System.out.println("Error not a single character ...");
        	
        }
        else if(!(upperCase || lowerCase))
        {
        	System.out.println("Error not a letter enter Uppercase or lowercase ...");
        }
        else if (vowels)
        {
        	System.out.println("Input Letter is vowels ...");
        }
        else
        {
        	System.out.println("Input Letter is Constant ...");
        }
	}

}
