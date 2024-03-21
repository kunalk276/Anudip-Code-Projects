package lab6;

public class OddNumberChecker 
{
	
	    public static void main(String[] args) 
	    {
	        try 
	        {
	            checkForOdd(5);
	            System.out.println("Number is even.");
	        } 
	        catch (Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }

	    static void checkForOdd(int number) throws Exception 
	    {
	        if (number % 2 != 0) 
	        {
	            throw new Exception("Number is odd.");
	        }
	    }
	}
