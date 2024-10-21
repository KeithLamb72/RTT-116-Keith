package Homework.InheritanceDemoGLAB_303_10_4;

/**
 * Circle class that extends Shape and implements the Movable interface.
 */
public class Circle extends Shape implements Movable {
    protected double radius;
    private int x, y; // Circle's coordinates

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Circle of radius " + radius);
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "," + super.toString() + "]";
    }
}

