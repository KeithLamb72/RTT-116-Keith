package Homework;

import java.util.Map;
import java.util.TreeMap;

/**
 * GLAB_303_11_7 - Phone Directory using TreeMap
 * Demonstrates how to use TreeMap for storing phone directory entries
 * and basic operations like adding, retrieving, and printing entries.
 */
public class GLAB_303_11_7 {

    // The TreeMap that will store the data with the name as the key and phone number as the value.
    private TreeMap<String, String> data;

    // Constructor creates an initially empty directory.
    public GLAB_303_11_7() {
        this.data = new TreeMap<>();
    }

    // Finds the phone number for a given name.
    // Returns the phone number or null if the name doesn't exist in the directory.
    public String getNumber(String name) {
        return this.data.get(name);
    }

    // Associates a given name with a phone number. If the name already exists, it updates the number.
    // Throws IllegalArgumentException if either name or number is null.
    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        this.data.put(name, number);
    }

    // Prints the contents of the phone directory.
    public void print() {
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            System.out.println(entry.getKey() + ":  " + entry.getValue());
        }
    }

    // Test class for PhoneDirectoryWithTreeMap
    public static void main(String[] args) {
        GLAB_303_11_7 directory = new GLAB_303_11_7();
        System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
        System.out.println("adds several entries.  It then prints the contents of");
        System.out.println("the directory and performs a few lookups.");
        System.out.println();

        // Adding entries to the directory
        directory.putNumber("Fred", "555-1234");
        directory.putNumber("Barney", "555-2345");
        directory.putNumber("Wilma", "555-3456");
        directory.putNumber("Wilma", "555-2563"); // Overwriting Wilma's number

        System.out.println("Contents are:");
        System.out.println();
        directory.print(); // Printing directory contents
        System.out.println();

        // Lookup for existing and non-existing names
        System.out.println("Number for Fred is " + directory.getNumber("Fred"));
        System.out.println("Number for Wilma is " + directory.getNumber("Wilma"));
        System.out.println("Number for Tom is " + directory.getNumber("Tom"));
        System.out.println("Number for Alex is " + directory.getNumber("Alex")); // Non-existing entries
    }
}

