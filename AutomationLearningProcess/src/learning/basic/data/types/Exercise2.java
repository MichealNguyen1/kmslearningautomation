package learning.basic.data.types;

import java.util.Scanner;

/**
 * Write a Java program to convert minutes into a number of years and days.
 * Test Data
 * Input the number of minutes: 3456789
 * Expected Output :
 * 3456789 minutes is approximately 6 years and 210 days
 */
public class Exercise2 {

    static int result;
    static int numOfMinutes;
    static int numYears = 0, numDays = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        numOfMinutes = sc.nextInt();
        System.out.println(numOfMinutes +" minutes is approximately "+convertToYearsAndDays());

    }

    public static String convertToYearsAndDays() {
        numYears = numOfMinutes / (365*24*60);
        numDays = (numOfMinutes % (365*24*60)) / (24*60);
        return numYears + " years and " + numDays + " days";
    }

}

