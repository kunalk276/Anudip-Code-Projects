package lab6;

import java.util.Scanner;

public class VotingApplication 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try 
        {
            if (age < 18)
            {
                throw new Exception("You are not eligible to vote.");
            }
            
            System.out.println("You are eligible to vote.");
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}

