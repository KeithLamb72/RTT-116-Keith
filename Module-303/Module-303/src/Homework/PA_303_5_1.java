package Homework;

import java.util.Scanner;

public class PA_303_5_1 {
    public static void main(String[] args) {
        printMultiplicationTable();
        findGreatestCommonDivisor();
        predictFutureTuition();
    }

    /*
    1. Write a program that uses nested for loops to print a multiplication table.
    */
    public static void printMultiplicationTable() {
        // Printing the header row for the multiplication table
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        // Printing the multiplication table
        for (int i = 1; i <= 12; i++) {
            for (int k = 1; k <= 12; k++) {
                System.out.printf("%4d", i * k);
            }
            System.out.println();
        }
    }

    /*
    2. Write a program that prompts the user to enter two positive integers and find their greatest common divisor (GCD).
    */
    public static void findGreatestCommonDivisor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second positive integer: ");
        int n2 = scanner.nextInt();

        int gcd = 1; // Initial GCD is set to 1
        int i = 2; // Possible GCD

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i; // Update gcd
            }
            i++; // Increase i to check the next possible gcd
        }

        System.out.println("The greatest common divisor is " + gcd);
    }

    /*
    3. Suppose the tuition for a university is $10,000 this year and increases by 7% every year.
       In how many years will the tuition be doubled?
    */
    public static void predictFutureTuition() {
        double tuition = 10000; // Initial tuition
        int year = 0; // Year counter
        double target = 20000; // Target tuition

        while (tuition < target) {
            tuition *= 1.07; // Increase tuition by 7%
            year++; // Increment the year counter
        }

        System.out.println("Tuition will be doubled in " + year + " years");
    }
}
