package learning.number.character.string.array;

import java.util.Scanner;

/**
 * Created by trangtnnguyen on 2/13/2019.
 */
public class TestArray2 {
    //passing array to method
    public static void main(String[] args) {
        printArray(new int[]{3, 1, 2, 6});
        System.out.println("Please enter a number: ");
        printArray2(new Scanner(System.in));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void printArray2(Scanner sc) {
        int a = sc.nextInt();
        System.out.println(a);
    }
}
