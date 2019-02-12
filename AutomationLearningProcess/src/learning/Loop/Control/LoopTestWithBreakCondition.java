package learning.Loop.Control;

/**
 * Created by trangtnnguyen on 2/12/2019.
 */
public class LoopTestWithBreakCondition {
    //When the break statement is encountered inside a loop,
    // the loop is immediately terminated
    // and the program control resumes at the next statement following the loop.

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
