package Homework;

import java.util.Collections;
import java.util.LinkedList;

public class GLAB_303_11_4 {

    // Example One: LinkedList Methods
    public static void linkedListMethods() {
        /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<>();

        /* Adding elements to the linked list */
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /* Display Linked List Content */
        System.out.println("Linked List Content: " + linkedlist);

        /* Add First and Last Element */
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedlist);

        /* Get and Set Values */
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " + firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " + firstvar2);

        /* Remove first and last element */
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedlist);

        /* Add to a Position and remove from a position */
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " + linkedlist);
    }

    // Example Two: Sorting LinkedList
    public static void sortLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        // Unsorted list
        System.out.println("Unsorted LinkedList: " + linkedList);

        // 1. Sort the list
        Collections.sort(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 2. Custom sorting (Reverse order)
        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println("Custom sorted (Reverse) LinkedList: " + linkedList);
    }

    public static void main(String[] args) {
        // Execute LinkedList Methods example
        System.out.println("----- LinkedList Methods Example -----");
        linkedListMethods();

        // Execute LinkedList Sorting example
        System.out.println("\n----- LinkedList Sorting Example -----");
        sortLinkedList();
    }
}
