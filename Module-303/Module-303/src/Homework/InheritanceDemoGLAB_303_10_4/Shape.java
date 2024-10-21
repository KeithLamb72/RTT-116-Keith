package Homework.InheritanceDemoGLAB_303_10_4;

/**
 * Abstract class Shape defining the common structure and behavior of all shapes.
 */
public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    public Shape() {}

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

    // Abstract method to be implemented by all subclasses
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayShapeName() {
        System.out.println("I am a Shape.");
    }
}

