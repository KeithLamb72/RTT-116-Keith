package M303_5;

import java.util.ArrayList;
import java.util.List;

//Intialize
//condition
//action or post loop action
public class ForLoopsExample {
    //Original 1970's For Loop
    //great to count or do something a set number of times
    //this is also good for positioning within an array or string.
    public static void main(String[] args) {
        //Counting UP
        for (int count = 0; count <= 10; count++) {// set count i to 0 //count to 10//go up in count
            System.out.println("For loop iteration " + count);
        }
        //Counting Down
        for (int count = 10; count >= 1; count--) {// set count i to 0 //count to 10//go up in count
            System.out.println("For loop iteration " + count);
        }
        //the array is 0 based .. so that means the positions in the same array free from 0 to 4
        String[] strings = {"one", "two", "three", "four", "five"};

        //Old Style for Loop
        //note that array.length is used without ()
        for (int pos = 0; pos < strings.length; pos++) {
            String value = strings[pos];
            System.out.println("string at position " + pos + " = " + value);
        }
        // New Style For Loop for Array
        // easier to read
        //Most cases start from beginning and go to the end
        //same as above but no positioning data but not big deal/ you dont care where it is in array just what product or info it is
        for (String value : strings) {
            System.out.println("string at position " + value);
        }

        //Looping over the characters
        //      0123456

        String characters = "abcdefg";

        //note that the string.length () does not use the ()
        for (int pos = 0; pos < characters.length(); pos++) {
            //in the string we are using the method CharAt to get the character at a position
            char value = characters.charAt(pos);
            System.out.println("character at position " + pos + " = " + characters.charAt(pos));
        }

        //Looping over a List
        List<String> stringList = new ArrayList<>();
        stringList.add("one"); // pos 1
        stringList.add("two"); // pos 2
        stringList.add("three"); // pos 3
        stringList.add("four"); // pos 4
        stringList.add("five"); // pos 5

        //stringList.size is a boundary condition
        //not that the list uses .size() to get the number of elements in the list
        for (int pos = 0; pos < stringList.size(); pos++) {
            //we are using .get function to get a element of the list by its position
            String value = stringList.get(pos);
            System.out.println("string at position " + pos + " = " + value);
        }

        // New Style For Loop
        // in mind - for sting in stringlist
        // this method is easier to type and read but doesn't contain the position in the list that each item came from
        // which is okay in lots of cases
        for (String string : stringList) {
            System.out.println("new for loop " + string);
        }
    }
}
