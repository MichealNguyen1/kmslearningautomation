package com.padi.datatype;

import java.util.Scanner;
import java.io.*;

public class Stringlength {
    public static void main(String []args){
        System.out.println("Input a String: ");
        Scanner inTel = new Scanner(System.in);
        String tell = inTel.nextLine();
        System.out.println("The length is: " + tell.length());
    }
}
