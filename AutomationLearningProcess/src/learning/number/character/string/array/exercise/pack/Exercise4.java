package learning.number.character.string.array.exercise.pack;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Exercise4 {
    public static void main(String[] args) {
        sortNumericArray(new int[]{3, 1, 2, 6, 4, 0});
        System.out.println("***********************");
        sortStringArray(new String[]{"b","f","g","a","s"});
    }

    public static void sortNumericArray(int[] array1) {
        System.out.println("Original numeric array: "+Arrays.toString(array1));
        System.out.print("Sorted numeric array: ");
        for (int i = 0; i < array1.length; i++) {
            Arrays.sort(array1);
            System.out.print(array1[i]+" ");
        }
        System.out.println();
    }

    public static void sortStringArray(String[] array2) {
        System.out.println("Original string array: "+Arrays.toString(array2));
        System.out.print("Sorted string array: ");
        for (int i = 0; i < array2.length; i++) {
            Arrays.sort(array2);
            System.out.print(array2[i]+" ");
        }

    }
}
