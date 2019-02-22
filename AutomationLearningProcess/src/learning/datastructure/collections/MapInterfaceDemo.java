package learning.datastructure.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by trangtnnguyen on 2/18/2019.
 */
public class MapInterfaceDemo {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara", "8"); //put(key, value)
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
       // System.out.println(m1.get("Ayan"));
    }
}
