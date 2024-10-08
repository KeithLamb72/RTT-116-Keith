package Homework;

public class PA_303_2_3 {
    public static void main(String[] args) {
        // 1. Left Shift Operator (<<)
        // Write a program that declares an integer variable x, assigns the value 2 to it,
        // prints out the binary string version of the number. Use the left shift operator
        // (<<) to shift by 1 and assign the result to x. Predict the decimal value and
        // binary string, then print out x in decimal and binary form. Perform the exercise with the following values:
        // 9, 17, 88

        int x = 2;
        System.out.println("Initial value of x: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();

        // Value is 9
        x = 9;
        System.out.println("Initial value of x: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();

        // Value is 17
        x = 17;
        System.out.println("Initial value of x: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();

        // Value is 88
        x = 88;
        System.out.println("Initial value of x: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // 2. Right Shift Operator (>>)
        // Perform the right shift operation and predict the decimal and binary values.
        // Do this for the values 150, 225, 1555, 32456.

        int x2 = 150;
        System.out.println("Initial value of x: " + x2);
        System.out.println("Binary: " + Integer.toBinaryString(x2));

        x2 = x2 >> 2;
        System.out.println("After right shift by 2:");
        System.out.println("Decimal: " + x2);
        System.out.println("Binary: " + Integer.toBinaryString(x2));
        System.out.println();

        // Value is 225
        x2 = 225;
        System.out.println("Initial value of x: " + x2);
        System.out.println("Binary: " + Integer.toBinaryString(x2));

        x2 = x2 >> 2;
        System.out.println("After right shift by 2:");
        System.out.println("Decimal: " + x2);
        System.out.println("Binary: " + Integer.toBinaryString(x2));
        System.out.println();

        // Value is 1555
        x2 = 1555;
        System.out.println("Initial value of x: " + x2);
        System.out.println("Binary: " + Integer.toBinaryString(x2));

        x2 = x2 >> 2;
        System.out.println("After right shift by 2:");
        System.out.println("Decimal: " + x2);
        System.out.println("Binary: " + Integer.toBinaryString(x2));
        System.out.println();

        // Value is 32456
        x2 = 32456;
        System.out.println("Initial value of x: " + x2);
        System.out.println("Binary: " + Integer.toBinaryString(x2));

        x2 = x2 >> 2;
        System.out.println("After right shift by 2:");
        System.out.println("Decimal: " + x2);
        System.out.println("Binary: " + Integer.toBinaryString(x2));

        // 3. Bitwise AND Operation
        // Perform a bitwise AND operation between two integers x and y, and predict the result.
        int x3 = 7;
        int y3 = 17;
        int z3 = x3 & y3;

        System.out.println("x in decimal: " + x3 + " and binary: " + Integer.toBinaryString(x3));
        System.out.println("y in decimal: " + y3 + " and binary: " + Integer.toBinaryString(y3));
        System.out.println("z (x & y) in decimal: " + z3 + " and binary: " + Integer.toBinaryString(z3));

        // 4. Bitwise OR Operation
        // Perform a bitwise OR operation between the same x and y values.
        z3 = x3 | y3;
        System.out.println("x in decimal: " + x3 + " and binary: " + Integer.toBinaryString(x3));
        System.out.println("y in decimal: " + y3 + " and binary: " + Integer.toBinaryString(y3));
        System.out.println("z (x | y) in decimal: " + z3 + " and binary: " + Integer.toBinaryString(z3));

        // 5. Postfix Increment Operator
        // Use a postfix increment operator to increase an integer value.
        int number5 = 10;
        System.out.println("Before increment: " + number5);
        number5++;
        System.out.println("After increment: " + number5);

        // 6. Multiple Increment Methods
        // Demonstrate three different ways to increment a variable by 1.
        int number6 = 5;
        System.out.println("Initial value: " + number6);
        number6++;
        System.out.println("After number6++: " + number6);
        ++number6;
        System.out.println("After ++number6: " + number6);
        number6 += 1;
        System.out.println("After number6 += 1: " + number6);

        // 7. Prefix vs Postfix Increment
        // Demonstrate the difference between prefix and postfix increment operators.
        int x7 = 5;
        int y7 = 8;
        int sum7 = ++x7 + y7;
        System.out.println("Using prefix increment (++x7):");
        System.out.println("x7: " + x7);
        System.out.println("y7: " + y7);
        System.out.println("Sum: " + sum7);

        x7 = 5;
        sum7 = x7++ + y7;
        System.out.println("Using postfix increment (x7++):");
        System.out.println("x7: " + x7);
        System.out.println("y7: " + y7);
        System.out.println("Sum: " + sum7);
    }
}
