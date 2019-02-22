package learning.datastructure.collections;

import java.util.TreeSet;

/**
 * Created by trangtnnguyen on 2/18/2019.
 */
public class TreeSetDemo {
    public static void main(String args[]) {
        // Create a tree set
        TreeSet ts = new TreeSet();

        // Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
        System.out.println("First element of ts is: "+ts.first());
        System.out.println("Last element of ts is: "+ts.last());
    }
}
