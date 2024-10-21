package Homework;

import java.util.Scanner;

public class PA_303_4_1 {
    public static void main(String[] args) {
        checkIfLessThan10();
        checkIfElseStatement();
        checkMultipleConditionsIfElse();
        checkRange();
        calculateGrade();
        printDayOfWeek();
        calculateTaxBasedOnFilingStatus();
    }
    /*
    1. Write a program that declares 1 integer variable x, and then assigns 7 to it.
    Write an if statement to print out “Less than 10” if x is less than 10.
    Change x to equal 15, and notice the result (console should not display anything).
     */
    public static void checkIfLessThan10() {
        int x = 7; // assigning 7 to x
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }

        x = 15; // change x to 15
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    /*
    2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
    Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10.
     Change x to 15 and notice the result.
     */
    public static void checkIfElseStatement() {
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    /*
    3. Write a program that declares 1 integer variable x, and then assigns 15 to it.
    Write an if-else-if statement that prints out “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20.
    Change x to 50 and notice the result.
     */
    public static void checkMultipleConditionsIfElse() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
        x = 50;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
    }

    /*
    4. Write a program that declares 1 integer variable x, and then assigns 15 to it.
    Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
    Change x to 5 and notice the result.
     */
    public static void checkRange() {
        int x = 15;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
        x = 5;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
    }
    /*
    5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: <60
    Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range” if the score is less than 0 or greater than 100.
     */
    public static void calculateGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    /*
    6. Write a program that accepts an integer between 1 and 7 from the user.
     Use a switch statement to print out the corresponding weekday.
     Print “Out of range” if the number is less than 1 or greater than 7.
     Do not forget to include “break” statements in each of your cases.
     */
    public static void printDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Out of range");
        }
    }
    /*
    7. Create a program that lets the users input their filing status and income. Display how much tax the user would have to pay according to status and income.
The U.S. federal personal income tax is calculated based on the filing status and taxable income.
There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
     */
    public static void calculateTaxBasedOnFilingStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your filing status (Single, Married Filing Jointly, Married Filing Separately, Head of Household): ");
        String status = scanner.nextLine();
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = 0;
        if (status.equalsIgnoreCase("Single")) {
            tax = calculateTax(income, 8350, 33950, 82250, 171550, 372950);
        } else if (status.equalsIgnoreCase("Married Filing Jointly") || status.equalsIgnoreCase("Qualifying Widow(er)")) {
            tax = calculateTax(income, 16700, 67900, 137050, 208850, 372950);
        } else if (status.equalsIgnoreCase("Married Filing Separately")) {
            tax = calculateTax(income, 8350, 33950, 68525, 104425, 186475);
        } else if (status.equalsIgnoreCase("Head of Household")) {
            tax = calculateTax(income, 11950, 45500, 117450, 190200, 372950);
        } else {
            System.out.println("Invalid filing status");
            scanner.close();
            return;
        }
        System.out.println("Your tax is: " + tax);
        scanner.close();
    }

    public static double calculateTax(double income, double bracket1, double bracket2, double bracket3, double bracket4, double bracket5) {
        double tax;
        if (income <= bracket1) {
            tax = income * 0.10;
        } else if (income <= bracket2) {
            tax = bracket1 * 0.10 + (income - bracket1) * 0.15;
        } else if (income <= bracket3) {
            tax = bracket1 * 0.10 + (bracket2 - bracket1) * 0.15 + (income - bracket2) * 0.25;
        } else if (income <= bracket4) {
            tax = bracket1 * 0.10 + (bracket2 - bracket1) * 0.15 + (bracket3 - bracket2) * 0.25 + (income - bracket3) * 0.28;
        } else if (income <= bracket5) {
            tax = bracket1 * 0.10 + (bracket2 - bracket1) * 0.15 + (bracket3 - bracket2) * 0.25 + (bracket4 - bracket3) * 0.28 + (income - bracket4) * 0.33;
        } else {
            tax = bracket1 * 0.10 + (bracket2 - bracket1) * 0.15 + (bracket3 - bracket2) * 0.25 + (bracket4 - bracket3) * 0.28 + (bracket5 - bracket4) * 0.33 + (income - bracket5) * 0.35;
        }
        return tax;
    }
}
