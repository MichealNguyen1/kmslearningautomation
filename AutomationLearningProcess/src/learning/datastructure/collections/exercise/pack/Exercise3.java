package learning.datastructure.collections.exercise.pack;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Write a Java program to compare element in a collection
 */
public class Exercise3 {
    static LinkedList llist2;

    public static void main(String[] args) {
        llist2 = new LinkedList();
        llist2.add("J");
        llist2.add("D");
        llist2.add("A");
        llist2.add("J");
        llist2.add("Z");
        llist2.add("K");
        llist2.add("D");
        llist2.add("V");
        llist2.add("D");
        llist2.add("A");

        System.out.println("Original content of llist2: "+llist2);
        compareElement();
    }

    public static void compareElement() {
        System.out.println("Comparison of elements in the LinkedList llist2: ");
        for (int j = 0; j < llist2.size(); j++) {
            Object baselineValue = llist2.get(j);
            // System.out.println("Round "+j+": "+"Baseline Value = llist[" + j + "]= " + baselineValue);
            for (int i = j; i < llist2.size(); i++) {
                Object listElement = llist2.get(i);
                if (i != j) {
                    if (baselineValue.equals(listElement)) {
                        System.out.println("llisted[" + j + "]" + " == " + "llist[" + i + "]" + " == " + listElement);
                    }
                }

            }

        }
    }

}



