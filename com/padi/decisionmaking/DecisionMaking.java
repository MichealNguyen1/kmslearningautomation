package com.padi.decisionmaking;

import java.util.Scanner;

public class DecisionMaking {
    void checkPassFail(int number){
        if (number>=50) System.out.println("PASS");
        else System.out.println("FAIL");
    }

    void printNumberInWord(int number){
        String result = "";
        switch (number){
            case 1:
                result = "ONE";
                break;
            case 2:
                result = "TWO";
                break;
            case 3:
                result = "THREE";
                break;
            case 4:
                result = "FOUR";
                break;
            case 5:
                result = "FIVE";
                break;
            case 6:
                result = "SIX";
                break;
            case 7:
                result = "SEVEN";
                break;
            case 8:
                result = "EIGHT";
                break;
            case 9:
                result = "NINE";
                break;
            default:
                result = "OTHER";
                break;
        }
        System.out.println("The number is: " + result);
    }
}

class TestDecision{
    public static void main(String []args){
        System.out.println("Input a number: ");
        Scanner inNum = new Scanner(System.in);
        int number = inNum.nextInt();
        DecisionMaking test = new DecisionMaking();
        test.checkPassFail(number);
        test.printNumberInWord(number);
    }
}
