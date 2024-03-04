package inheritance;

class Shape12 {
    public void draw() {
        System.out.println("Drawing generic shape");
    }

    public double calculateArea() {
        return 0; 							// Default implementation for unknown shape
    }
}

class Circle1 extends Shape12 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

   
    public void draw() {
        System.out.println("Drawing Circle");
        
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    
    public void draw() {
        System.out.println("Drawing Cylinder");
       	
    }

    public double calculateArea(int radius) {
       	
        return (2 * Math.PI * radius * height) + (2 * super.calculateArea());
    }
}

public class Shape2 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(5);
        Cylinder cylinder = new Cylinder(3, 7);

        circle1.draw();
        System.out.println("Area of Circle: " + circle1.calculateArea());

        cylinder.draw();
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea());
    }
}
