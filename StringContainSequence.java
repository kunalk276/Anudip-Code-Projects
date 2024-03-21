package lab7;
import java.util.Scanner;

public class StringContainSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Prompt user to enter the sequence to check
        System.out.print("Enter the sequence of characters to check for: ");
        String sequence = scanner.nextLine();

        // Check if the string contains the specified sequence
        boolean containsSequence = inputString.contains(sequence);

        if (containsSequence) {
            System.out.println("The string contains the specified sequence of characters.");
        } else {
            System.out.println("The string does not contain the specified sequence of characters.");
        }

        scanner.close();
    }
}

