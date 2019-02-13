package learning.number.character.string.array;

/**
 * Created by trangtnnguyen on 2/13/2019.
 */
public class SplitDemo {
    public static void main(String args[]) {
        String Str = new String("Welcome-to-Tutorialspoint.com");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-", 2)) {
            System.out.println(retval);
        }
        System.out.println("*******************");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-", 3)) {
            System.out.println(retval);
        }
        System.out.println("*******************");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-", 0)) {
            System.out.println(retval);
        }
        System.out.println("*******************");
    }
}
