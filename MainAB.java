package oops;

public class MainAB {

    public static void main(String[] args) {
        B objB = new B(10, "Example");
        
        objB.display();     			 // Accessing method from class A
        
        objB.displayName(); 			 // Accessing method from class B
    }
}

































//
//This file contains the Main class, also declared within the oops package.
//The Main class contains the main method, which serves as the entry point of the program.
//Inside the main method, an object objB of class B is created, passing 10 as the value for num and "Example" as the value for name.
//The display() method of class A is invoked on objB, demonstrating method inheritance from class A.
//The displayName() method of class B is invoked on objB, demonstrating the unique method of class B.