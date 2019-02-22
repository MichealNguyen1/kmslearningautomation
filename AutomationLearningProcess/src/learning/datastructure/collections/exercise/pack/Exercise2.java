package learning.datastructure.collections.exercise.pack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by trangtnnguyen on 2/18/2019.
 * Write a Java program to search an element inside a linked list
 */
public class Exercise2 {
    static LinkedList llist2;
    public static void main(String[] args) {
        llist2 = new LinkedList();
        llist2.add("J");
        llist2.add("D");
        llist2.add("A");
        llist2.add("C");
        llist2.add("Z");
        llist2.add("K");

        System.out.println("Content of llisted2: "+llist2);
        search2("A");
        search2("K");
        search2("V");
    }


    /*
    public static void search1(Object searchElement) {
        for (int i = 0; i < llist2.size(); i++) {
            Object listElement = llist2.get(i);
            if (searchElement.equals(listElement)) {
                System.out.println("Found " + searchElement + " at position " + i);
                return;
            }
        }
        System.out.println(searchElement + " does not appear in the list");
    }
*/



     public static void search2(Object searchElement) {
         Iterator<String> itr = llist2.iterator();
         int index = -1;

         while(itr.hasNext()){
             index++;
             if (searchElement.equals(itr.next())) {
                 System.out.println("Found " + searchElement + " at position " +index);
                 return;
             }
         }
         System.out.println(searchElement + " does not appear in the list");
         }

    }


