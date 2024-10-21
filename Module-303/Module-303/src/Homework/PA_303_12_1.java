package Homework;

public class PA_303_12_1 {
}
// Hacker Rank
/*
Java Exception Handling (Try-catch)
import java.util.InputMismatchException;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } finally {
            scanner.close();
        }
    }
}
 */
/*
Java Exception Handling
import java.io.*;
import java.util.*;

public class Solution {

    static class MyCalculator {
        public long power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("java.lang.Exception: n or p should not be negative.");
            }
            if (n == 0 && p == 0) {
                throw new Exception("java.lang.Exception: n and p should not be zero.");
            }
            return (long) Math.pow(n, p);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();

            try {
                long result = myCalculator.power(n, p);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}

 */