package Homework.InheritanceDemoGLAB_303_10_4;

/**
 * Main class for demonstrating movement and area calculation of shapes.
 */
public class myRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 5);
        System.out.println(circle);
        System.out.println("Initial Coordinate: " + circle.getCoordinate());
        circle.moveUp();
        System.out.println("After Moving Up: " + circle.getCoordinate());
        circle.moveRight();
        System.out.println("After Moving Right: " + circle.getCoordinate());
        circle.moveDown();
        System.out.println("After Moving Down: " + circle.getCoordinate());
        circle.moveLeft();
        System.out.println("After Moving Left: " + circle.getCoordinate());
    }
}

