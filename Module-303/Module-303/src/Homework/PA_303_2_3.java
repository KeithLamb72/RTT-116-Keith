package Homework;

public class PA_303_2_3 {
    public static void main(String[] args) {

        int a = 2;
        // Predicted: Decimal = 4, Binary = 100
        a = a << 1;
        System.out.println("2 << 1 : Decimal = " + a + ", Binary = " + Integer.toBinaryString(a));
        a = 9;
        // Predicted: Decimal = 18, Binary = 10010
        a = a << 1;
        System.out.println("9 << 1 : Decimal = " + a + ", Binary = " + Integer.toBinaryString(a));
        a = 17;
        // Predicted: Decimal = 34, Binary = 100010
        a = a << 1;
        System.out.println("17 << 1 : Decimal = " + a + ", Binary = " + Integer.toBinaryString(a));
        a = 88;
        // Predicted: Decimal = 176, Binary = 10110000
        a = a << 1;
        System.out.println("88 << 1 : Decimal = " + a + ", Binary = " + Integer.toBinaryString(a));
        System.out.println("******************************************************");

        // Right Shift operator
        int b = 150;
        // Predicted: Decimal = 37, Binary = 100101
        a = b >> 2;
        System.out.println("150 >> 2 : Decimal = " + b + ", Binary = " + Integer.toBinaryString(a));

        b = 225;
        // Predicted: Decimal = 56, Binary = 111000
        b = b >> 2;
        System.out.println("225 >> 1 : Decimal = " + a + ", Binary = " + Integer.toBinaryString(a));

        b = 1555;
        // Predicted: Decimal = 388, Binary = 110000100
        b = b >> 2;
        System.out.println("1555 >> 2 : Decimal = " + a + ", Binary = " + Integer.toBinaryString(a));

        b = 32456;
        // Predicted: Decimal = 176, Binary = 10110000
        b = b >> 2;
        System.out.println("32456 >> 2 : Decimal = " + a + ", Binary = " + Integer.toBinaryString(a));
        System.out.println("******************************************************");

        // bitwise AND (&) operation

        int A = 7; // Binary = 0111
        int B = 17; // Binary = 10001
        // Predicted: z = 1, Binary = 00001
        int C = A & B;
        System.out.println("A & B : Decimal = " + C + ", Binary = " + Integer.toBinaryString(C));
        System.out.println("******************************************************");

        // bitwise OR (|) operation

        int a2 = 7; // Binary = 0111
        int b2 = 17; // Binary = 10001
        // Predicted: z = 23, Binary = 10111
        int c2 = a2 | b2;
        System.out.println("a2 | b2 : Decimal = " + c2 + ", Binary = " + Integer.toBinaryString(c2));
        System.out.println("******************************************************");

        // postfix increment (a3++)

        int a3 = 10;
        System.out.println("Before increment: " + a3);
        a3++;
        System.out.println("After increment: " + a3);
        System.out.println("******************************************************");

        // multiple ways to increment

        int a4 = 5;
        System.out.println("Initial value: " + a4);

        // Method 1: Using a++
        a4++;
        System.out.println("After a++: " + a4);

        // Method 2: Using ++a
        ++a4;
        System.out.println("After ++a4: " + a4);

        // Method 3: Using a = a + 1
        a4 = a4 + 1;
        System.out.println("After a4 = a4 + 1: " + a4);
        System.out.println("******************************************************");

        // difference between prefix and postfix increment

        int a5 = 5;
        int b5 = 8;

        // Using prefix increment (++a)
        int total = ++a5 + b5;
        System.out.println("Using prefix (++a5): Sum = " + total + ", a5 = " + a5); // Sum = 14

        // Resetting a
        a5 = 5;

        // Using postfix increment (a5++)
        total = a5++ + b5;
        System.out.println("Using postfix (a5++): Sum = " + total + ", a5 = " + a5); // Sum = 13

    }
}
