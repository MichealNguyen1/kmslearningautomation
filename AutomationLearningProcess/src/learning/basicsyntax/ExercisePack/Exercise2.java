package learning.basicsyntax.ExercisePack;

/**
 * Created by trangtnnguyen on 1/25/2019.
 */
public class Exercise2 {
    public static void main(String[] args) {
       //System.out.println(74+36);
       int sum = addTwoNumbers(74,36);
        System.out.println("Total = "+sum);
    }

    public static int addTwoNumbers(int a, int b){
        return a+b;
    }
}
