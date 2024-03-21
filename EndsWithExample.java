package lab7;
import java.util.Scanner;

public class EndsWithExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt user to enter the string to check
        System.out.print("Enter the string to check if it's at the end: ");
        String endString = scanner.nextLine();

        // Check if the main string ends with the specified string
        boolean endsWith = mainString.endsWith(endString);

        if (endsWith) {
            System.out.println("The main string ends with the specified string.");
        } else {
            System.out.println("The main string does not end with the specified string.");
        }

        scanner.close();
    }
}
