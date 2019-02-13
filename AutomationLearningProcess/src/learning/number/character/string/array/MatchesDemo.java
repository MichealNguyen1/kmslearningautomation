package learning.number.character.string.array;

/**
 * Created by trangtnnguyen on 2/13/2019.
 */
public class MatchesDemo {
    public static void main(String args[]) {
        String Str = new String("Welcome to Tutorialspoint.com");

        System.out.print("Return Value :" );
        System.out.println(Str.matches("(.*)Tutorials(.*)"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Tutorials"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Welcome(.*)"));
    }
}
