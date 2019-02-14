package learning.Loop.Control;

/**
 * Created by trangtnnguyen on 2/12/2019.
 */
public class LoopExerciseSolution2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int k=i+1;k<=7;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
