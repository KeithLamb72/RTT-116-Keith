package M303_6;

public class ArrayExamples {



    public static void main(String[] args ) {

        //this makes a new array of size 10 and all elements will be 0
        int[] numbers = new int[10];

        for (int pos = 0; pos < numbers.length ; pos++) {
            numbers[pos] = pos;
            System.out.print("number[" + pos + "] = " + numbers[pos]);
        }
        //array by hard coding
        //this willcreate a new int array with size of 6
        // and automatically fill the array with the given values
        int[] numbers1 = { 1, 2, 3, 4, 5, 6};

        //this will create an array of size 6 with this given value
        String [] strings = { "one", "two", "three", "four", "five" };
    }
}
