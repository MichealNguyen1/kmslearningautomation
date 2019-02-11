package com.padi.basicdatatype;

import java.util.Scanner;

public class TempConversion {
    private double temp; //Celsius
    //private float y; //Fahrenheit
    TempConversion(double temp){
        this.temp = temp;
    }

    void FahrenheitToCelsius(){
        double result = (temp-32)*5/9;
        System.out.printf("Fahrenheit to Celsius: %.2f %n",result);
    }

    void CelsiusToFahrenheit(){
        double result = (temp*9/5)+32;
        System.out.printf("Celsius to Fahrenheit: %.2f %n",result);
    }
}

class TestTempConversion{
    public static void main(String []args){
        System.out.println("Input a Celsius");
        Scanner inCel = new Scanner(System.in);
        float temp = inCel.nextFloat();
        TempConversion cel = new TempConversion(temp);
        cel.CelsiusToFahrenheit();
        System.out.println("Input a Fahrenheit");
        Scanner inFah = new Scanner(System.in);
        temp = inFah.nextFloat();
        TempConversion fah = new TempConversion(temp);
        fah.FahrenheitToCelsius();
    }
}
