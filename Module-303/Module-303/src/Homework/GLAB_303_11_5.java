package Homework;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

// GLAB_303_11_5 Class demonstrating HashSet and TreeSet processing
public class GLAB_303_11_5 {

    // Example One: Insert Elements to HashSet using addAll()
    public static void hashSetExampleOne() {
        HashSet<Integer> evenNumber = new HashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
    }

    // Example Two: Union of Sets using addAll()
    public static void hashSetExampleTwo() {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        // Union of two sets
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);
    }

    // Example Three: Difference of Sets using removeAll()
    public static void hashSetExampleThree() {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference: " + primeNumbers);
    }

    // Example Four: Enhanced for() Loop for HashSet
    public static void hashSetExampleFour() {
        HashSet<String> hset = new HashSet<>();
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        hset.add("Apple"); // Duplicate
        hset.add(null);     // Null value
        hset.add(null);     // Duplicate null value

        for (String str : hset) {
            System.out.println(" ---> " + str);
        }
    }

    // TreeSet Example One: Iterate Through TreeSet using Iterator
    public static void treeSetExampleOne() {
        TreeSet<Integer> num_Treeset = new TreeSet<>();
        num_Treeset.add(20);
        num_Treeset.add(5);
        num_Treeset.add(15);
        num_Treeset.add(25);
        num_Treeset.add(10);

        Iterator<Integer> iter_set = num_Treeset.iterator();
        System.out.print("TreeSet using Iterator: ");
        while (iter_set.hasNext()) {
            System.out.print(iter_set.next() + ", ");
        }
        System.out.println();
    }

    // TreeSet Example Two: Remove Elements using remove() and removeAll()
    public static void treeSetExampleTwo() {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }

    // TreeSet Example Three: Methods for Navigation using first() and last()
    public static void treeSetExampleThree() {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);
    }

    // TreeSet Example Four: Sorting TreeSet Alphabetically in Reverse Order
    public static void treeSetExampleFour() {
        TreeSet<String> cities = new TreeSet<>(new cities_Comparator());
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        // Print the TreeSet sorted in reverse order
        System.out.println("TreeSet: " + cities);
    }

    // Main method to execute the examples
    public static void main(String[] args) {
        System.out.println("----- HashSet Example One -----");
        hashSetExampleOne();

        System.out.println("\n----- HashSet Example Two -----");
        hashSetExampleTwo();

        System.out.println("\n----- HashSet Example Three -----");
        hashSetExampleThree();

        System.out.println("\n----- HashSet Example Four -----");
        hashSetExampleFour();

        System.out.println("\n----- TreeSet Example One -----");
        treeSetExampleOne();

        System.out.println("\n----- TreeSet Example Two -----");
        treeSetExampleTwo();

        System.out.println("\n----- TreeSet Example Three -----");
        treeSetExampleThree();

        System.out.println("\n----- TreeSet Example Four -----");
        treeSetExampleFour();
    }

    // Comparator class for reverse alphabetical order sorting
    public static class cities_Comparator implements Comparator<String> {
        @Override
        public int compare(String cities_one, String cities_two) {
            int value = cities_one.compareTo(cities_two);
            // Sort elements in reverse order
            return value > 0 ? -1 : value < 0 ? 1 : 0;
        }
    }
}

