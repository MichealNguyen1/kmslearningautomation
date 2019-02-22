package learning.datastructure.collections.exercise.pack;

import java.util.LinkedList;

/**
 * Write a Java program to to get first and last element of a linked list
 */
public class Exercise1 {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.add("B");
        llist.add("V");
        llist.add("C");
        llist.add("A");
        llist.add("P");

        System.out.println("Content of llist: "+llist);
        System.out.println("First element of llist: "+llist.getFirst());
        System.out.println("Last element of llist: "+llist.getLast());

    }
}
