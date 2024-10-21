package Homework;

import java.util.Scanner;

public class GLAB_303_6_1 {

    public static void main(String[] args) {
        accessArrayElements();
        usingForLoop();
        iteratingWithEnhancedForLoop();
        computeSumAndAverage();
        calculateMeanAndStandardDeviation();
        insertElementAtEnd();
    }
    // Example 1: Access Array Elements
    public static void accessArrayElements() {
        int[] age = {12, 4, 5, 2, 5};//create an array
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }
    // Example 2: Using for Loop
    public static void usingForLoop() {
        int[] age = {12, 4, 5};
        System.out.println("Using for Loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
    // Example 3: Iterating Over an Array using Enhanced For Loop
    public static void iteratingWithEnhancedForLoop() {
        String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};
        for (String name : names) {
            System.out.println(name);
        }
    }
    // Example 4: Compute the Sum and Average of Array Elements
    public static void computeSumAndAverage() {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
    // Example 5: Mean and Standard Deviation
    public static void calculateMeanAndStandardDeviation() {
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        for (int mark : marks) {
            sum += mark;
            sumSq += mark * mark;
        }
        double mean = (double) sum / marks.length;
        double stdDev = Math.sqrt((double) sumSq / marks.length - mean * mean);
        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);
    }
    // Example 6: Insert an Element at the end of an Array in Java
    public static void insertElementAtEnd() {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[11];
        System.out.print("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter an Element to Insert: ");
        int element = scan.nextInt();
        arr[10] = element;
        System.out.println("\nNow the new array is: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        scan.close();
    }
}
