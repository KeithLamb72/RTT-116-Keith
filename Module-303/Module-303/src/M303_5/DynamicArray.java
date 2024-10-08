package M303_5;

public class DynamicArray {

    // pos = 0123456789
    // val = 1234567891
    //                0
    public static double[] insert(double[] array, int position, double value) {
        double[] result = new double[array.length + 1];//Step 1 need to make a new array that is of size one larger

        //Step 2 copy all the elements from 0 to position we insert to the new array
        for (int pos = 0; pos < array.length; pos++) {
            result[pos] = array[pos];
        }
        //Step 3
        result[position] = value;

        //Step 4
        for (int pos = position; pos < array.length; pos++) {
            result[pos + 1] = array[pos];
        }
        return result;
    }

    public static double[] delete(double[] array, int position) {
        //step 1 is create a new array that is 1 smaller
        double[] result = new double[array.length - 1];
        //step 2
        for ( int pos = 0; pos < position ; pos++ ) {
            result[pos] = array[pos];
        }
        //step 3
        for ( int pos = position + 1; pos < array.length; pos++ ) {
            result[pos -1] = array[pos];
        }
        return result;
    }
        // arrays cant be changed
        //you have to move all info from one array into another for it to fit correctly.
        public static void main (String[]args){
            double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            numbers = insert(numbers, 3, 3.5);
            numbers = delete(numbers, 8);
        }


        public static double[] append(double[] array, int position, double value) {
        double[] result = new double[array.length + 1];

        for (int pos = 0; pos < array.length; pos++) {
            result[pos] = array[pos];
        }

        // step 3 - could do this a couple different ways.
        result[array.length] = value;

        return result;
        }
    }
