package com.padi.operator;

import java.util.Scanner;

public class OddorEven {
    private int number;

    OddorEven(int number){
        this.number = number;
    }

    void printResult(){
        if (this.number%2==1)
            System.out.println("The number is an Odd");
        else
            System.out.println("The number is an even");
    }
}

class TestNumber{
    public static void main(String []args){
        System.out.print("Input a number: ");
        Scanner inNum = new Scanner(System.in);
        int number = inNum.nextInt();
        OddorEven result = new OddorEven(number);
        result.printResult();
    }
}
