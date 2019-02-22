package learning.datastructure.collections;

import java.util.LinkedHashSet;

/**
 * Created by trangtnnguyen on 2/18/2019.
 */
public class LinkedHashSetDemo {
    public static void main(String args[]) {
        // create a hash set
        LinkedHashSet hs = new LinkedHashSet();

        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);
    }
}
