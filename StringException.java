package lab6;

public class StringException 
{

    public static void main(String[] args) 
    {
        String input1 = "Hello";
        String input2 = "knlkdm";

        try 
        {
            if (containsVowels(input1))
                System.out.println("String \"" + input1 + "\" contains vowels.");
            else
                throw new NoVowelsException();
        } 
        catch (NoVowelsException e)
        {
            System.out.println("String \"" + input1 + "\" does not contain vowels.");
        }

        try
        {
            if (containsVowels(input2))
                System.out.println("String \"" + input2 + "\" contains vowels.");
            else
                throw new NoVowelsException();
        } 
        catch (NoVowelsException e) 
        {
            System.out.println("String \"" + input2 + "\" does not contain vowels.");
        }
    }

    static boolean containsVowels(String input)
    {
        for (char c : input.toCharArray()) 
        {
            if ("AEIOUaeiou".indexOf(c) != -1) 
            {
                return true;
            }
        }
        return false;
    }
}

class NoVowelsException extends Exception 
{
	
}
