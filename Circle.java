
/* Q.Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle. */


package demoClass;

import java.util.Scanner;

	public class Circle {
		
			double radius;

    
    public Circle(double radius) {      //  Calling Constructor
        this.radius = radius;                // .this is used here for the ---> refrence of a current class variable
    }

    
    public double getRadius() {        // Method For GET Radius
        return radius;
    }

    
    public void setRadius(double radius) {         // Method for set the radius 
        
        this.radius = radius;
    }

    
    public double calculateArea() {                // Method for calculate area
        return Math.PI * radius * radius;
    }

    
    public double calculateCircumference() {                // Method for  calculate circumference
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        Circle circle = new Circle(radius);     // Creating circle object with User defined radius

        
        System.out.println("Radius of the circle: " + circle.getRadius());

       
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);

                double circumference = circle.calculateCircumference();
        System.out.println("Circumference of the circle: " + circumference);

        
    }
}
