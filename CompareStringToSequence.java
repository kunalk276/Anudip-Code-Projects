package lab7;

import java.util.Scanner;

public class CompareStringToSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Prompt user to enter the character sequence
        System.out.print("Enter the character sequence to compare: ");
        String sequence = scanner.nextLine();

        // Compare the string to the character sequence
        boolean isEqual = inputString.equals(sequence);

        if (isEqual) {
            System.out.println("The string is equal to the specified character sequence.");
        } else {
            System.out.println("The string is not equal to the specified character sequence.");
        }

        scanner.close();
    }
}
