package com.padi.basicdatatype;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String []args){
        System.out.print("Input the time zone offset: ");
        Scanner inTime = new Scanner(System.in);
        long timeZoneChange = inTime.nextLong();
        long curTime = System.currentTimeMillis();
        long totalSeconds = curTime / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
