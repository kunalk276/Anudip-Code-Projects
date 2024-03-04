package oops;

class Shape1 {
 
 double getArea()  // Method to get area
 {
     return 0; // Default implementation returns 0
 }
}


class Rectangle extends Shape {
 private double length;
 private double width;
 
 
 Rectangle(double length, double width) // Constructor
 {
     this.length = length;
     this.width = width;
 }
 
 
 
 double getArea() 
 {
     return length * width;
     
 }
}

public class Shape    //Main class

{   
 public static void main(String[] args) 
 {
    
     Rectangle rectangle = new Rectangle(5, 10);   // Create an instance of Rectangle
     
     
     double area = rectangle.getArea();       // Get the area of the rectangle
     
     System.out.println("Area of the rectangle: " + area);
 }


}
