package learning.datastructure.collections;

import java.util.HashSet;

/**
 * Created by trangtnnguyen on 2/18/2019.
 */
public class HashSetDemo {
    public static void main(String args[]) {
        // create a hash set
        HashSet hs = new HashSet();

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
