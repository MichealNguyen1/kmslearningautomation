package learning.number.character.string.array;

/**
 * Created by trangtnnguyen on 2/13/2019.
 */
public class SplitDemo2 {
    public static void main(String args[]) {
        String Str = new String("Welcome-to-Tutorialspoint.com");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-")) {
            System.out.println(retval);
        }
    }
}
