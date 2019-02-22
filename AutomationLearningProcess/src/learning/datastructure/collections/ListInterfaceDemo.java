package learning.datastructure.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by trangtnnguyen on 2/18/2019.
 */
public class ListInterfaceDemo {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);
    }
}
