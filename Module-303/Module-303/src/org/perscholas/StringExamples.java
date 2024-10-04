package org.perscholas;

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
        System.out.println(filename.substring(0,4));

        System.out.println(filename.substring(1,5));

        //when we use a single argument with substring it is simply the starting position ,and it will take the rest of the string
        System.out.println(filename.substring( 4));

        // we want to print out index of . in the string
        //indexOf fins first occurrence of wtv you're looking for
        System.out.println("The . is in position " + filename.indexOf("."));

        //so to get the file extension we can use a combination of substring and indexOf
        //lastIndexOf will find the last index of what ever you are looking for
        //this can also be tought of search from the left to right instead of right to left
        System.out.println(filename.substring(filename.lastIndexOf(".")));

        System.out.print(filename.substring(0,9));

        //Challenge ... how do I get just the filename without the extension
        System.out.println(filename.substring(0,filename.lastIndexOf(".")));

        //!!! VERY IMPORTANT NOTE
        //this will not work properly
        String s1 = new String("abc");
        String s2 = new String("abc");
        //ALWAYS WRONG - this is never correct for strings
        System.out.println( s1 == s2 );// this will print false because they are different memory location

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

        //*** String Buffer *****// better for memory management

        //The StringBuffer is mutable - same effect as concat
        //when doing lots of string manipulation is a high volume system
        StringBuffer sb = new StringBuffer();

        //append will add something to the end of the string and it has the same effect as concat for strings
        //these 2 lines of code are the equivalent of doing "abc"
        sb.append("abc");
        sb.append("123");

        System.out.println(sb.toString());

        }
    }
}
