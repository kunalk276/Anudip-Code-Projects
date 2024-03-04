package inheritance;

abstract class Shape {
    public abstract void draw();
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public void draw() {
        System.out.println("Drawing Circle");
       	
    }

   
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    
    public void draw() {
        System.out.println("Drawing Square");
        	
    }

   
    public double calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public void draw() {
        System.out.println("Drawing Triangle");
       	
    }

    
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 6);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}

