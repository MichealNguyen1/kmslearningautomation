package learning.Decision.Making;

import java.util.Scanner;

/**
 * Write a program called CheckPassFail which prints "PASS"
 * if the int variable "mark" is more than or equal to 50;
 * or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
 */
public class CheckPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your mark: ");
        while (sc.hasNext()) {
            int mark = sc.nextInt();
            if (mark >= 50) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
            System.out.println("DONE");
            System.out.print("Please enter your mark: ");
        }
    }
}
