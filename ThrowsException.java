package lab6;

public class ThrowsException
{

    public static void main(String[] args) 
    {
        try 
        {
            throw new Exception("This is an exception message.");
        } 
        catch (Exception e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
