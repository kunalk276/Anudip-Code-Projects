package stringdemo;

public class Example 
{
    static void anyMethod()
    {
        try
        {
            return;
        }
        catch (Exception e) 
        {
            return;
        }
        finally
        {
            System.out.println("finally Block");
        }
    }
     
    public static void main(String[] args) 
    {   
        anyMethod();
    }
}
