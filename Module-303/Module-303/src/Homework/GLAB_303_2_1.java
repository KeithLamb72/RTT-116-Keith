package Homework;

public class GLAB_303_2_1 {
    public static void main(String[] args) {

        // Arithmetic Operators Demo
        int a;
        int b = 10;
        int c = 5;
        a = b + c;
        System.out.println("+ operator resulted in " + a);
        a = b - c;
        System.out.println("- operator resulted in " + a);
        a = b * c;
        System.out.println("* operator resulted in " + a);
        a = b / c;
        System.out.println("/ operator resulted in " + a);
        a = b % c;
        System.out.println("% operator resulted in " + a);
        a = b++;
        System.out.println("Postfix ++ operator resulted in " + a);
        a = ++c;
        System.out.println("Prefix ++ operator resulted in " + a);
        a = -b;
        System.out.println("Unary operator resulted in " + a);

        // Some examples of special Cases
        int maxOverflow = Integer.MAX_VALUE + 1; // -2147483648 which is Integer.MIN_VALUE.
        int minOverflow = Integer.MIN_VALUE - 1; // 2147483647 which is Integer.MAX_VALUE.
        System.out.println("maxOverflow becomes " + maxOverflow);
        System.out.println("minOverflow becomes " + minOverflow);
        System.out.println(4.0 / 0.0); // Prints: Infinity
        System.out.println(-4.0 / 0.0); // Prints: -Infinity
        System.out.println(0.0 / 0.0); // Prints: NaN

        double d1 = 12 / 8; // result: 1 by integer division. The value of d1 becomes 1.0.
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);
        System.out.println("-------------------------------------------------------");

        // Assignment Operators Demo
        int x, y;
        x = 10; // x gets the value 10.
        x = 5; // x gets the value 5. The previous value is overwritten.
        y = x; // y gets the value 5.
        System.out.println("x is : " + x);
        System.out.println("y is : " + y);
        // Multiple Assignments
        y = x = 10; // (y = (x = 10))
        System.out.println("x is : " + x);
        System.out.println("y is : " + y);
        System.out.println("-------------------------------------------------------");

        // Logical Operators Demo
        boolean m = true;
        boolean n = false;
        System.out.println("m & n : " + (m & n));
        System.out.println("m && n : " + (m && n));
        System.out.println("m | n : " + (m | n));
        System.out.println("m || n: " + (m || n));
        System.out.println("m ^ n : " + (m ^ n));
        System.out.println("!m : " + (!m));
        System.out.println("-------------------------------------------------------");

        // Relational Operators Demo
        int i = 10, j = 5;
        System.out.println("i > j : " + (i > j));
        System.out.println("i < j : " + (i < j));
        System.out.println("i >= j : " + (i >= j));
        System.out.println("i <= j : " + (i <= j));
        System.out.println("i == j : " + (i == j));
        System.out.println("i != j : " + (i != j));

        int p = 50, q = 100, r = 50;
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("r = " + r);
        System.out.println("p == q: " + (p == q));
        System.out.println("p == r: " + (p == r));
        System.out.println("-------------------------------------------------------");

        // Ternary Operator Demo
        int age = 18;
        String result = age < 100 ? "Less than 100" : "Greater than 100";
        System.out.println(result); // Less than 100
        System.out.println("-------------------------------------------------------");

        // Unary Operator
        int sum = +1;
        // sum is now 1
        System.out.println(sum);

        sum--;
        // sum is now 0
        System.out.println(sum);

        sum++;
        // sum is now 1
        System.out.println(sum);

        sum = -sum;
        // sum is now -1
        System.out.println(sum);

        boolean resultBool = false;
        // false
        System.out.println(resultBool);
        // true
        System.out.println(!resultBool);
    }
}
