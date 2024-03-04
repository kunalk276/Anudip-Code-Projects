package oops;

public class B extends A {
     String name;

    public B(int num, String name) {
        super(num);
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name in class B: " + name);
    }
}























//This file defines a class named B, which is also declared within the oops package.
//The class B extends class A, which means it inherits all the non-private members of class A, including the protected variable num and the display() method.
//B has an additional private instance variable name of type String.
//The constructor B(int num, String name) initializes the num variable inherited from class A using the super keyword, and initializes the name variable with the value passed as an argument.
//There's a method displayName() which prints the value of the name variable to the console.