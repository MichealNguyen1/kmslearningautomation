package learning.Operator;

import java.util.Scanner;

/**
 * Created by trangtnnguyen on 2/12/2019.
 */
public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = sc.nextInt();
        if(input%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
