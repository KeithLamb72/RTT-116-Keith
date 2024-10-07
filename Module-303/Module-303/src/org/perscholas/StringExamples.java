package org.perscholas;

import java.text.DecimalFormat;
import java.util.StringJoiner;

public class StringExamples {
    public static void main(String[] args) {
        // total length of string is 6 characters

        // 0 based indexing // Arrays, Lists , etc
        //0,1,2,3,4,5

        String s = "abcdef";

        //this will print the length of the string (method length)
        System.out.println("The length of the string is " + s.length());

        //this will print the string in upper case
        System.out.println("Uppercase = " + s.toUpperCase());


        String concat = s.concat("ghijk");
        System.out.println(concat);

        System.out.println(s.charAt(0)); // will give single print a
        System.out.println(s.charAt(5)); // this will print f
        // System.out.println(s.charAt(6)); // there is no position 6 - 0 based indexing

        String r = "abc123abc";
        //replace a with z
        System.out.println(r.replace('a', 'z'));

        //replace abc with kil
        System.out.println(r.replace("abc", "kil"));

        //replaceAll with uses a regular expression
        System.out.println(r.replaceAll("\\d", "9"));

        // ==== SubString ****// very important**
        //0123456789012
        String filename = "someimage.jpg";

        // this goes from position 0 to position 4 but does not include position 4
        System.out.println(filename.substring(0, 4));

        System.out.println(filename.substring(1, 5));

        //when we use a single argument with substring it is simply the starting position ,and it will take the rest of the string
        System.out.println(filename.substring(4));

        // we want to print out index of . in the string
        //indexOf fins first occurrence of wtv you're looking for
        System.out.println("The . is in position " + filename.indexOf("."));

        //so to get the file extension we can use a combination of substring and indexOf
        //lastIndexOf will find the last index of what ever you are looking for
        //this can also be tought of search from the left to right instead of right to left
        System.out.println(filename.substring(filename.lastIndexOf(".")));

        System.out.print(filename.substring(0, 9));

        //Challenge ... how do I get just the filename without the extension
        System.out.println(filename.substring(0, filename.lastIndexOf(".")));

        //!!! VERY IMPORTANT NOTE
        //this will not work properly
        String s1 = new String("abc");
        String s2 = new String("abc");
        //ALWAYS WRONG - this is never correct for strings
        System.out.println(s1 == s2);// this will print false because they are different memory location

        //ALWAYS the correct way to correct for stings
        System.out.println(s1.equals(s2)); // this will show true
        //this will compare 2 strings without case sensitivity
        System.out.println(s1.equalsIgnoreCase(s2));

        //convert from string to number
        String n = "101";
        //this will take the string 101 and covert it to the number it to the number on hundred one

        Integer n1 = Integer.parseInt(n);
        //this method can throw an exception error because the string may not contain only numbers
        //Integer n3 = Integer.parseInt("1234abc");

        //converting from number to string is easy
        String n2 = n1.toString();

        // IMPORTANT - String in Java are immutable - meaning they can't be changed after they are created
        String s4 = "abc";
        String s5 = "123";

        // when s4.toUpperCase is called it creates another brand new string in memory that is ABC
        // it did not Modify s4 ... it created a new string
        // then it concatination on the string s5 when creates yet another new string in memory that is assigned to variables s6
        String s6 = s4.toUpperCase() + s5;

        //*** String Buffer *****// better for memory management KPA QUESTION
        //WHY USE STRING BUFFER
        // for memory management and the string is immutable
        //The StringBuffer is mutable - same effect as concat
        //when doing lots of string manipulation is a high volume system
        StringBuffer sb = new StringBuffer();

        //append will add something to the end of the string and it has the same effect as concat for strings
        //these 2 lines of code are the equivalent of doing "abc"
        //appending is adding something to the end

        //0213456789
        //abc1xyz23
        sb.append("abc");
        sb.append("123");

        //this will insert at position 4
        sb.insert(4, "xyz");

        //replace function for String Buffer
        // start at position 0 and got position 3 (but not include position 3)


        //maybe it easier to think about replace as 2 operations
        //operation 1) starting at position 0 and going to postion 3 be deleted
        //operation 2) starting at position 0 and the string will be inserted
        //starting at postiion 0 to position 3 is 3 characters that will be essentially deleted
        sb.replace(0, 3, "ABCDEF");

        sb.delete(0, 3);

        sb.reverse();

        //***THIS IS ON KPA****//
        //StringBuffer
        StringBuffer kba = new StringBuffer("ABC");
        kba.replace(0, 7, "DEFG").insert(0, "12345");
        kba.reverse();
        kba.delete(0, 5);
        //THIS IS ON KPA
        System.out.println(sb.toString());

        //**** String Joiner ****//
        //String Joiner// Another KPA question // MEMORIZE THEN FORGET

        StringJoiner sj1 = new StringJoiner(",", "{", "}");//This is for csv file maybe kind not needed
        StringJoiner sj2 = new StringJoiner(":", "[", "]");
        sj1.add("Eric");
        sj1.add("Jessica");
        sj2.add("Jeff");
        sj2.add("Kiet");

        System.out.println(sj1);
        System.out.println(sj2);

        System.out.println(sj1.merge(sj2).toString());

        //** Formatting **/

        //  int i = 1024;
        //   byte b = 127;
        //double d = 1.232, tiny = d / 1000000.0;
        // boolean bool = true;
        // System.out.format("");


        //*******DECIMAL FORMATTING//-- used alot during monetary

        //it takes in a patter
        String pattern = "##_###_###_##";
        double number = 123456789.123;

        DecimalFormat numberFormat = new DecimalFormat(pattern);
        System.out.println(numberFormat.format(number));


        // ****** TRIM ******

        String t = "   abc123   ";
        System.out.println("->" + t + "<-");
        System.out.println("->" + t.trim() + "<-");

        // **** Split ****

        String vowels = "a,e,i,o,u";

        String[] result = vowels.split(":");

        System.out.println(result);

    }
}

