package learning.basic.data.types;

import java.util.Scanner;

/**
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 * LoopTest Data
 * Input a degree in Fahrenheit: 212
 * Expected Output:
 * 212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */

public class Exercise1 {

    static double tempInFahrenheit = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        tempInFahrenheit = sc.nextDouble();
        System.out.println(tempInFahrenheit + " degree Fahrenheit is equal to " + convertFtoC() + " in Celsius.");
    }

    public static double convertFtoC() {
        double degreeInCelsius = (tempInFahrenheit - 32) * 5 / 9;
        return degreeInCelsius;
    }
}
