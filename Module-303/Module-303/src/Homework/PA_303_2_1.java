package Homework;

import java.text.DecimalFormat;

public class PA_303_2_1 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        // Adding two integer numbers
        int total = number1 + number2;
        System.out.println("The sum of the two integers is: " + total);
        System.out.println("******************************");

        double number3 = 15.5;
        double number4 = 20.5;
        // Adding two double numbers
        double totalDouble = number3 + number4;
        System.out.println("The sum of the two doubles is: " + totalDouble);
        System.out.println("******************************");

        // Adding double and integer values together
        double mixedSum = number1 + number3;
        System.out.println("The sum of an integer and a double is: " + mixedSum);
        System.out.println("******************************");

        // Determine the larger and smaller integer numbers
        int maxInt = Math.max(number1, number2);
        int minInt = Math.min(number1, number2);
        // Dividing the larger integer by the smaller one
        int intDivision = maxInt / minInt;
        System.out.println("Integer division result: " + intDivision);

        // Changing the larger integer number to a double for division
        double largerAsDouble = 10.0;
        double doubleDivisionResult = largerAsDouble / minInt;
        System.out.println("Decimal division result: " + doubleDivisionResult);
        System.out.println("******************************");

        // Determine the larger and smaller double numbers
        double maxDouble = Math.max(number3, number4);
        double minDouble = Math.max(number3, number4);
        // Dividing the larger double by the smaller one
        double doubleDivResult = maxDouble / minDouble;
        System.out.println("Double division result: " + doubleDivResult);

        // Casting a double into an integer and dividing
        int castedResult = (int) doubleDivResult;
        System.out.println("Casting double result to integer: " + castedResult);
        System.out.println("******************************");

        int a = 5;
        int b = 6;
        int divInt = b / a;
        System.out.println("Integer division result: " + divInt);
        // Cast b to a double and perform division
        double castedDiv = (double) b / a;
        System.out.println("Casting int to double division result: " + castedDiv);
        System.out.println("******************************");

        // Calculate the Rectangle Area using a Named Constant
        final double INCHES_TO_CM = 2.54;
        double lengthInches = 10;
        double widthInches = 5;
        double lengthCm = lengthInches * INCHES_TO_CM;
        double widthCm = widthInches * INCHES_TO_CM;
        // Calculate the area in square centimeters
        double areaCm = lengthCm * widthCm;

        // Print the result
        System.out.println("The area of the rectangle in square centimeters is: " + areaCm);
        System.out.println("******************************");

        // Problem 8: Calculating Total Sales

        double coffeeCost = 2.50;
        double greenTeaCost = 3.15;
        double espressoCost = 4.25;

        int coffeeQuantity = 3;
        int greenTeaQuantity = 4;
        int espressoQuantity = 2;

        double subtotal = (coffeeCost * coffeeQuantity) + (greenTeaCost * greenTeaQuantity) + (espressoCost * espressoQuantity);

        final double TAX_RATE = 0.08;

        double totalSales = subtotal + (subtotal * TAX_RATE);
        // Format the result to 2 decimal places
        DecimalFormat decimalFormatter = new DecimalFormat("0.00");

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total Sales with Tax: $" + decimalFormatter.format(totalSales));
    }
}

