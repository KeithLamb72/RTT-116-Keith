package Homework;

import java.util.Scanner;

public class GLAB_303_5_1 {
    public static void main(String[] args) {
        printJavaIsFunFiveTimes();
        displaySumOfNaturalNumbers();
        checkIfPalindrome();
        printPyramid();
    }

    public static void printJavaIsFunFiveTimes() {
        int n = 5;
        // for loop to print "Java is fun" five times
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
    }

    public static void displaySumOfNaturalNumbers() {
        int sum = 0;
        int n = 1000;
        // for loop to calculate the sum of natural numbers from 1 to 1000
        for (int i = 1; i <= n; ++i) {
            sum += i; // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }

    public static void checkIfPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        String original = scanner.nextLine();
        String reverse = "";
        int length = original.length();

        // for loop to reverse the string
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }
        scanner.close(); // Closing the scanner
    }

    public static void printPyramid() {
        int rows = 5;
        // for loop for rows
        for (int i = 1; i <= rows; i++) {
            // nested for loop for printing '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // moving to the next line after each row
        }
    }
}
