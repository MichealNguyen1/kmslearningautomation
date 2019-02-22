package learning.datastructure.collections.exercise.pack;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by trangtnnguyen on 2/18/2019.
 * Write a Java program to remove a specific element from a collection
 */
public class Exercise4 {
    static LinkedList llist3;

    public static void main(String[] args) {
        llist3 = new LinkedList();
        llist3.add("J");
        llist3.add("D");
        llist3.add("A");
        llist3.add("B");
        llist3.add("Z");
        llist3.add("K");

        System.out.println("Original content of llisted3: " + llist3);
        removeAnElement("A");
        removeAnElement("Y");
    }

    public static void removeAnElement(Object removalValue) {
        Iterator<String> itr = llist3.iterator();
        int index = -1;
        while (itr.hasNext()) {
            if ((itr.next()).equals(removalValue)) {
                index = llist3.indexOf(removalValue);
            }
        }
        if (index == -1) {
            System.out.println("llist3 does not content element " + removalValue);
        } else {
            llist3.remove(index);
            System.out.println("llisted3 after removal of element "+removalValue+": " + llist3);
        }
    }

}

