package Homework;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Comparator;

// GLAB_303_11_6 Class demonstrating HashMap and TreeMap processing
public class GLAB_303_11_6 {

    // Example One: Remove HashMap Elements
    public static void exampleOneHashMap() {
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);

        // Remove element associated with key 2
        String value = languages.remove(2);
        System.out.println("Removed value: " + value);
        System.out.println("Updated HashMap: " + languages);
    }

    // Example Two: Create HashMap and Remove Elements
    public static void exampleTwoHashMap() {
        HashMap<String, String> newHashMap = new HashMap<>();
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");

        System.out.println("Original map contains: " + newHashMap);
        System.out.println("Size of original Map: " + newHashMap.size());

        // Copy contents to another HashMap
        HashMap<String, String> copyHashMap = newHashMap;
        System.out.println("copyHashMap mappings: " + copyHashMap);

        // Remove null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMap null key value: " + nullKeyValue);
        System.out.println("copyHashMap after removing null key: " + copyHashMap);
        System.out.println("Size of copyHashMap: " + copyHashMap.size());
    }

    // Example One: Remove TreeMap Elements
    public static void exampleOneTreeMap() {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("TreeMap: " + numbers);

        // Remove element with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // Remove element with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers);
    }

    // Example Two: Methods for Navigation in TreeMap
    public static void exampleTwoTreeMap() {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);

        System.out.println("TreeMap: " + numbers);

        // Using firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());

        // Using lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());
    }

    // Example Three: TreeMap Comparator for Custom Sorting
    public static void exampleThreeTreeMap() {
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);

        System.out.println("TreeMap: " + numbers);
    }

    // Main method to execute the examples
    public static void main(String[] args) {
        System.out.println("----- HashMap Example One -----");
        exampleOneHashMap();

        System.out.println("\n----- HashMap Example Two -----");
        exampleTwoHashMap();

        System.out.println("\n----- TreeMap Example One -----");
        exampleOneTreeMap();

        System.out.println("\n----- TreeMap Example Two -----");
        exampleTwoTreeMap();

        System.out.println("\n----- TreeMap Example Three -----");
        exampleThreeTreeMap();
    }

    // Comparator class for TreeMap to sort elements in reverse order
    public static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String number1, String number2) {
            return number1.compareTo(number2) > 0 ? -1 : 1;
        }
    }
}

