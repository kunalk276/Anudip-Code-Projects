
/* Q. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle. */


package demoClass;


import java.util.Scanner;

public class Rectangle {
			double width;
			double height;

    
    public Rectangle(double width, double height) {  // applying  Constructor
    	
        this.width = width;         // .this is used here for the ---> refrence of a current class variable
        this.height = height;       
    }

   
    public double calculateArea() {    // Method  calculate area
        return width * height;
    }

    
    
    public double calculatePerimeter() {   // Method  calculate perimeter
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();

        System.out.print("Enter height of the rectangle: ");
        double height = sc.nextDouble();

        
        Rectangle rectangle = new Rectangle(width, height);   // Create object rectangle 

        
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);      // Calculate and print area

        
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);

        
       
    }
}



