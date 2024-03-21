package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            readFile("nonexistentfile.txt");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    static void readFile(String filename) throws FileNotFoundException 
    {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
