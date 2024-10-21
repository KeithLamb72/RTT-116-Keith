package Homework;

/**
 * The Shape class is the superclass for all shapes, providing basic properties and methods.
 */
class Shape {
    private String color;
    protected double area = 1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {}

    public Shape(String color, double area, double base, double width, double height) {
        this.color = color;
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public double getArea() {
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }

    public void displayShapeName() {
        System.out.println("I am a Shape.");
    }
}

/**
 * The Circle class extends Shape, providing specific implementations for circle properties.
 */
class Circle extends Shape {
    protected double radius;
    final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        super.area = PI * Math.pow(this.radius, 2);
        return super.area;
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}

/**
 * The Rectangle class extends Shape, with methods to manage rectangle-specific properties.
 */
class Rectangle extends Shape {
    public Rectangle(String color) {
        super(color);
    }

    public Rectangle() {}

    public Rectangle(String color, double area, double base, double width, double height) {
        super(color, area, base, width, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
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
 * The Triangle class extends Shape, providing triangle-specific implementations.
 */
class Triangle extends Shape {
    public Triangle() {}

    public Triangle(String color, double area, double base, double width, double height) {
        super(color, area, base, width, height);
    }

    public Triangle(String color) {
        super(color);
    }

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
 * The Cylinder class extends Circle, adding height to compute volume and surface area.
 */
class Cylinder extends Circle {
    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public double getVolume() {
        return PI * Math.pow(radius, 2) * height;
    }

    public double getSurfaceArea() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Cylinder for radius " + radius + " and height " + height);
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + radius + ", height=" + height + "]";
    }
}

/**
 * The MyRunner class contains the main method to demonstrate polymorphism and object type casting.
 */
public class GLAB_303_10_2 {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        Shape sObj = new Shape();
        sObj.displayShapeName();
        System.out.println(sObj instanceof Shape);

        Shape shapeCircleObj = new Circle(100);
        shapeCircleObj.displayShapeName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);

        Shape shapeRectangleObj = new Rectangle("Red");
        shapeRectangleObj.displayShapeName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);

        Shape shapeTriangleObj = new Triangle("Blue");
        shapeTriangleObj.displayShapeName();
        shapeTriangleObj.setHeight(2);
        shapeTriangleObj.setBase(3);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);

        Cylinder cylinderShape = new Cylinder(3, 3);
        cylinderShape.displayShapeName();
        System.out.println("Volume of Cylinder is " + cylinderShape.getVolume());
        System.out.println(cylinderShape);
    }
}
