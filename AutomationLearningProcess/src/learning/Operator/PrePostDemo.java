package learning.Operator;

/**
 * Created by trangtnnguyen on 2/12/2019.
 */
public class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;  // i is increased to 4
        System.out.println(i);    // "4"
        ++i; // increase i to 5 then returned the increased value.
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6" => increase i to 6, then return the increased value
        System.out.println(i++);  // "6" => returned i as 6, then increase it to 7
        System.out.println(i);    // "7"
    }
}
