package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class PA_303_7_1 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    // Task 1: Create an array of integers and print each element.
    public static void task1() {
        System.out.println("\nTask 1:");
        int[] array = {1, 2, 3};
        System.out.println("Array elements:");
        for (int num : array) {// new style for loop
            System.out.println(num);
        }
    }

    // Task 2: Find and print the middle element of an integer array.
    public static void task2() {
        System.out.println("\nTask 2:");
        int[] array = {13, 5, 7, 68, 2};
        System.out.println("Middle element: " + array[array.length / 2]);
    }

    // Task 3: Create an array, clone it, and print the cloned array.
    public static void task3() {
        System.out.println("\nTask 3:");
        String[] colors = {"red", "green", "blue", "yellow"};
        String[] copy = colors.clone();
        System.out.println("Original array length: " + colors.length);
        System.out.println("Copied array: " + Arrays.toString(copy));
    }

    // Task 4: Access the first and last elements of an array; demonstrate exception handling.
    public static void task4() {
        System.out.println("\nTask 4:");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        try {
            System.out.println(numbers[numbers.length]); // Attempt to access an index out of bounds.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            numbers[numbers.length] = 10; // Attempt to assign a value to an index out of bounds.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught when assigning: " + e.getMessage());
        }
    }

    // Task 5: Initialize an integer array using loop control variables.
    public static void task5() {
        System.out.println("\nTask 5:");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }

    // Task 6: Initialize an integer array with values being multiples of 2 of the index.
    public static void task6() {
        System.out.println("\nTask 6:");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        System.out.println("Array: " + Arrays.toString(numbers));
    }

    // Task 7: Print all elements of an array except the middle one.
    public static void task7() {
        System.out.println("\nTask 7:");
        int[] elements = {1, 2, 3, 4, 5};
        for (int i = 0; i < elements.length; i++) {
            if (i != elements.length / 2) {
                System.out.println("Element at index " + i + ": " + elements[i]);
            }
        }
    }

    // Task 8: Swap the first and middle elements of a String array.
    public static void task8() {
        System.out.println("\nTask 8:");
        String[] array = {"one", "two", "three", "four", "five"};
        System.out.println("Original array: " + Arrays.toString(array));
        // Swapping first and middle elements
        String temp = array[0];
        array[0] = array[array.length / 2];
        array[array.length / 2] = temp;
        System.out.println("Modified array: " + Arrays.toString(array));
    }

    // Task 9: Sort an array and print the smallest and largest elements.
    public static void task9() {
        System.out.println("\nTask 9:");
        int[] array = {4, 2, 9, 13, 1, 0};
        Arrays.sort(array);
        System.out.println("Array in ascending order: " + Arrays.toString(array));
        System.out.println("The smallest number is " + array[0]);
        System.out.println("The biggest number is " + array[array.length - 1]);
    }

    // Task 10: Create a heterogeneous array and print it.
    public static void task10() {
        System.out.println("\nTask 10:");
        Object[] objects = {42, "string", "another string", 3.14};
        System.out.println("Heterogeneous array: " + Arrays.toString(objects));
    }

    // Task 11: Dynamic array creation based on user input for storing their favorite things.
    public static void task11() {
        System.out.println("\nTask 11:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int count = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        String[] things = new String[count];
        for (int i = 0; i < things.length; i++) {
            System.out.print("Enter your thing: ");
            things[i] = scanner.nextLine();
        }
        System.out.println("Your favorite things are: ");
        for (String thing : things) {
            System.out.print(thing + " ");
        }
        scanner.close();
    }
}
