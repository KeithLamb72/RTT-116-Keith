package Homework;

import java.util.Arrays;

public class GLAB_303_3_1 {

    public static void trimMethod () {
        String s1 = "  hello   ";
        System.out.println(s1 + "how are you");
        System.out.println(s1.trim() + " how are you");
    }

    public static void toLowerCaseMethod () {
        String s1 = "Howdy how ARE You?";
        String s1lower = s1.toLowerCase();
        System.out.println(s1lower);
    }

    public static void toUpperCaseMethod () {
        String s1 = "howdy how are you?";
        String s1upper = s1.toUpperCase();
        System.out.println(s1upper);
    }

    public static void concatMethod () {
        String str1 = "Learn ";
        String str2 = "Java";
        System.out.println(str1.concat(str2));


        System.out.println(str2.concat(str1));

        String str3 = "hello";
        String str4 = "Learners";

        String str5 = str3 + str4;
        System.out.println(str5);

        String message = "Welcome " + "to " + "Java";
        System.out.println(message);


        String s = "Chapter " + 2;

        String s1 = "Supplement" + 'B';
    }

    public static void splitMethod () {
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
    }

    public static void charAtMethod () {
        String message = "Welcome to Java";
        System.out.println("The first character in the message is " + message.charAt(0));
    }

    public static void subStringMethod () {
        String str1 = "welcome to java";

        System.out.println(str1.substring(0, 4));
    }

    public static void indexOfMethod () {
        String str1 = "welcome to java";
        int result;

        result = str1.indexOf('s');

        System.out.println(result);

        result = str1.lastIndexOf('a');
        System.out.println(result);

        result = str1.lastIndexOf('j');
        System.out.println(result);

        result = str1.lastIndexOf("ava");
        System.out.println(result);

        result = str1.lastIndexOf("java");
        System.out.println(result);
    }

    public static void replaceMethod () {
        String str1 = "abc cba";

        System.out.println(str1.replace('a', 'z'));

        System.out.println("Lava".replace('L', 'J'));

        System.out.println("Hello".replace('4', 'J'));

        System.out.println("C++ Java & C+".replace("C++", "Java"));

        System.out.println("aa bb aa zz".replace("aa", "zz"));

        System.out.println("Java".replace("C++", "C"));
    }

    public static void replaceAllMethod () {
        String str1 = "Hel12345lo";
        System.out.println(
                str1.replaceAll("\\d", " ").replaceAll("\\s+", " ")
        );
    }


    public static void main (String[]args){
        System.out.println("*** trim Method ***");
        trimMethod();
        System.out.println("*** toUpperCase Method ***");
        toLowerCaseMethod();
        System.out.println("*** toUpperCase Method ***");
        toUpperCaseMethod();
        System.out.println("*** concat Method ***");
        concatMethod();
        System.out.println("*** split Method ***");
        splitMethod();
        System.out.println("*** charAt Method ***");
        charAtMethod();
        System.out.println("*** substring Method ***");
        subStringMethod();
        System.out.println("*** indexOf Method ***");
        indexOfMethod();
        System.out.println("*** replace Method ***");
        replaceMethod();
        System.out.println("*** replaceAll Method ***");
        replaceAllMethod();
    }
}
