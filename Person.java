
/*  Q. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age. */


package demoClass;

import java.util.Scanner;

public class Person {
	
			String name;
     		int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name; // .this is used here for the ---> refrence of a current class variable
        this.age = age;   
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create first person
        System.out.println("Enter the name of the first person:");
        String name1 = scanner.nextLine();

        System.out.println("Enter the age of the first person:");
        int age1 = scanner.nextInt();
         

        Person person1 = new Person(name1, age1);

        // Create second person
        
        System.out.println("\nEnter the name of the second person:");
        scanner.nextLine();      // Consume the newline character
        String name2 = scanner.nextLine();

        System.out.println("Enter the age of the second person:");
        int age2 = scanner.nextInt();       

        Person person2 = new Person(name2, age2);

        

                                      // Printing the  info of persons
        
        System.out.println("\nPerson 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);

        System.out.println("\nPerson 2:");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
    }
}