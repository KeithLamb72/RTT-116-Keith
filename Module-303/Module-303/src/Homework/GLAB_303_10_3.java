package Homework;

/*
public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    // Constructor removed since abstract classes do not require constructors when not instantiating directly

    // Setters for properties
    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Abstract method to calculate the area of the shape
    public abstract double getArea();

    // Method to display the type of shape
    public void displayShapeName() {
        System.out.println("I am a Shape.");
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }
}

/**
 * Circle class extends Shape and provides implementation for area calculation.

public class Circle extends Shape {
    protected double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method to calculate the area of a circle
    @Override
    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}

/**
 * Rectangle class extends Shape and provides implementation for area calculation.

public class Rectangle extends Shape {

    public Rectangle(String color, double width, double height) {
        super.color = color;
        super.width = width;
        super.height = height;
    }

    // Implementing the abstract method to calculate the area of a rectangle
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle[height=" + height + ", width=" + width + ", " + super.toString() + "]";
    }
}

/**
 * Triangle class extends Shape and provides implementation for area calculation.

public class Triangle extends Shape {

    public Triangle(String color, double base, double height) {
        super.color = color;
        super.base = base;
        super.height = height;
    }

    // Implementing the abstract method to calculate the area of a triangle
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a Triangle");
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ", height=" + height + ", " + super.toString() + "]";
    }
}

/**
 * Main class to demonstrate the use of abstract classes and polymorphism.

public class MyRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle);
        System.out.println("Area of Circle: " + circle.getArea());

        Rectangle rectangle = new Rectangle("Red", 4, 2);
        System.out.println(rectangle);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        Triangle triangle = new Triangle("Blue", 3, 10);
        System.out.println(triangle);
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}

*/