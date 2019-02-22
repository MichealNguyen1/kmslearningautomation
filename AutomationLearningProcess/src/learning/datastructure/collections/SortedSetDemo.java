package learning.datastructure.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by trangtnnguyen on 2/18/2019.
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        // Create the sorted set
        SortedSet set = new TreeSet();

        // Add elements to the set
        set.add("c");
        set.add("a");
        set.add("b");

        // Iterating over the elements in the set
        Iterator it = set.iterator();

        while (it.hasNext()) {
            // Get element
            Object element = it.next();
            System.out.println(element.toString());
        }
    }
}
