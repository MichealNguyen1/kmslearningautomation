package learning.Loop.Control;

/**
 * Created by trangtnnguyen on 2/12/2019.
 */
//The continue keyword can be used in any of the loop control structures.
// It causes the loop to immediately jump to the next iteration of the loop.

public class LoopTestWithContinueCondition {
    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
