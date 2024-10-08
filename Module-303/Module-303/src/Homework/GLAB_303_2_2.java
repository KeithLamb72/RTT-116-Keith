package Homework;

public class GLAB_303_2_2 {
    // Implicit casting and Auto Type Conversion

    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 40.5;
        long num3 = 30;
        float num4 = 10.60f;
        // int result1 = num1 + num2; (1) // Error; cannot convert from double to int.
        double result1 = num1 + num2;
        System.out.println("Sum of two numbers: " + result1);

        // long result2 = num3 - num4; // (2) // Error; cannot convert from float to long.
        float result2 = num3 - num4;
        System.out.println("Subtraction of two numbers: " + result2);
        System.out.println("*********************************************");

        // Automatic Type Promotion
        byte byteValue = 42;
        char charValue = 'a';
        short shortValue = 1024;
        int intValue = 50000;
        float floatValue = 5.67f;
        double doubleValue = .1234;
        // Expression:
        double result3 = (floatValue * byteValue) + (intValue / charValue) - (doubleValue * shortValue);
        // Result after all the promotions are done.
        System.out.println("Result after type promotion = " + result3);
        System.out.println("*********************************************");

        // Narrowing Conversion

        double originalDouble = 100.04;
        // explicit type casting
        long longValue = (long) originalDouble;
        int intFromLong = (int) longValue;
        System.out.println("Original double value: " + originalDouble);
        System.out.println("Long value after conversion: " + longValue);
        System.out.println("Int value after conversion: " + intFromLong);

        byte byteResult;
        int largeInt = 257;
        double largeDouble = 323.142;
        System.out.println("Conversion of int to byte.");
        byteResult = (byte) largeInt;
        System.out.println("largeInt = " + largeInt + ", byteResult = " + byteResult);
        System.out.println("Conversion of double to int.");

        largeInt = (int) largeDouble;
        System.out.println("largeDouble = " + largeDouble + ", largeInt = " + largeInt);
        System.out.println("Conversion of double to byte.");

        byteResult = (byte) largeDouble;
        System.out.println("largeDouble = " + largeDouble + ", byteResult = " + byteResult);
        System.out.println("*********************************************");

    }
}

