package lab7;
import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt user to enter the index
        System.out.print("Enter the index to get the character from: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < inputString.length()) {
            char character = inputString.charAt(index);
            System.out.println("Character at index " + index + " is: " + character);
        } else {
            System.out.println("Invalid index. Please enter an index within the string length.");
        }

        scanner.close();
    }
}
