package lab7;
import java.util.Scanner;

public class ConcatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt user to enter the second string
        System.out.print("Enter the string to concatenate: ");
        String secondString = scanner.nextLine();

        // Concatenate the strings
        String concatenatedString = firstString.concat(secondString);

        // Print the concatenated string
        System.out.println("Concatenated string: " + concatenatedString);

        scanner.close();
    }
}
