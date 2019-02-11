package com.padi.basicdatatype;

import java.util.Scanner;

public class MinConversion {
    private int minutes;
    //private String result;
    MinConversion(int minutes){
        this.minutes = minutes;
    }

    void MinToYear(){
        int day = this.minutes/1440;
        int year = day/365;
        day %= 365;
        System.out.println("The result is: " + year + " years" + " and " + day + " days");
    }
}

class TestMinConversion{
    public static void main(String []args){
        System.out.print("Input minutes: ");
        Scanner inMin = new Scanner(System.in);
        int minutes = inMin.nextInt();
        MinConversion m2y = new MinConversion(minutes);
        m2y.MinToYear();
    }
}