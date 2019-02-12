package learning.Decision.Making;

import java.util.Scanner;

/**
 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER"
 * if the int variable "number" is 1, 2,... , 9, or other, respectively.
 * Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.
 */
public class PrintNumberInWord {
    static Scanner sc1 = new Scanner(System.in);
    static int number;
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        number = sc1.nextInt();
        printUsingNestedIf();
        printUsingSwitch();
    }

    public static void printUsingNestedIf() {
        if (number == 1) {
            System.out.print("ONE");
        } else if (number == 2) {
            System.out.print("TWO");
        } else if (number == 3) {
            System.out.print("THREE");
        } else if (number == 4) {
            System.out.print("FOUR");
        } else if (number == 5) {
            System.out.print("FIVE");
        } else if (number == 6) {
            System.out.print("SIX");
        } else if (number == 7) {
            System.out.print("SEVEN");
        } else if (number == 8) {
            System.out.print("EIGHT");
        } else if (number == 9) {
            System.out.print("NINE");
        } else {
            System.out.print("OTHER");
        }
        System.out.println(" (printUsingNestedIf is called)");
    }


    public static void printUsingSwitch() {
        switch (number) {
            case 1:
                System.out.print("ONE");
                break;
            case 2:
                System.out.print("TWO");
                break;
            case 3:
                System.out.print("THREE");
                break;
            case 4:
                System.out.print("FOUR");
                break;
            case 5:
                System.out.print("FIVE");
                break;
            case 6:
                System.out.print("SIX");
                break;
            case 7:
                System.out.print("SEVEN");
                break;
            case 8:
                System.out.print("EIGHT");
                break;
            case 9:
                System.out.print("NINE");
                break;
            default:
                System.out.print("OTHER");
                break;
        }
        System.out.println(" (printUsingSwitch is called)");
    }
}
