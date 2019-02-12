package learning.Decision.Making;

/**
 * Created by trangtnnguyen on 2/12/2019.
 */
public class ContinueExample {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++)
        {
            // If the number is even
            // skip and continue
            if (i%2 == 0)
                continue;

            // If number is odd, print it
            System.out.print(i + " ");
        }
    }
}
