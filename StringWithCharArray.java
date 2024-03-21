package lab7;
public class StringWithCharArray {
    public static void main(String[] args) {
        // Character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        // Create a String object from the character array
        String str = new String(charArray);

        // Print the String object
        System.out.println("String created from character array: " + str);
    }
}
