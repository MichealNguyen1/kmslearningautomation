package learning.basic.data.types;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

/**
 Write a Java program that prints the current time in GMT.
 Test Data
 Input the time zone offset to GMT: 2.
 Expected Output: Current time is 23:40:24
 Solution: Get the current GMT time and plus with timezone offset.
 The result will display the time with GMT time with format hh:mm:ss
 */
public class Exercise3 {
    public static void main(String[] args) {
        TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
        TimeZone.setDefault(gmtTimeZone);
        Calendar myCal = Calendar.getInstance(gmtTimeZone);
        Date myDate = myCal.getTime();
        System.out.println(myDate);

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String fDate1 = dateFormat1.format(myDate);
        System.out.println("Current datetime in GMT: "+fDate1);

        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy");
        String fDate2 = dateFormat2.format(myDate);

        System.out.print("Input the time zone offset to GMT: ");
        Scanner sc = new Scanner(System.in);
        int offset = sc.nextInt();

        long hourWithOffset = LocalDateTime.now().getHour()+offset;
        long minWithOffset = LocalDateTime.now().getMinute();
        long secWithOffset = LocalDateTime.now().getSecond();

        //Calculate time if hourWithOffset >= 24
        if(hourWithOffset>=24){
            hourWithOffset = hourWithOffset - 24;
            long newDate1 = LocalDate.now().getDayOfMonth()+1;
            String offsetDate1 = LocalDate.now().getMonthValue()+"/"+ newDate1+"/"+LocalDate.now().getYear();
            System.out.println("Current datetime with offset: "+offsetDate1+" "+hourWithOffset+":"+minWithOffset+":"+secWithOffset);

        }else if(hourWithOffset<0){ ////Calculate time if hourWithOffset < 0
            hourWithOffset = 24 + LocalDateTime.now().getHour() + offset;
            long newDate2 = LocalDate.now().getDayOfMonth()-1;
            String offsetDate2 = LocalDate.now().getMonthValue()+"/"+ newDate2+"/"+LocalDate.now().getYear();
            System.out.println("Current GMT datetime with offset: "+offsetDate2+" "+hourWithOffset+":"+minWithOffset+":"+secWithOffset);
        }
        else {
            System.out.println("Current GMT datetime with offset: " + fDate2 + " " + hourWithOffset + ":" + minWithOffset + ":" + secWithOffset);
        }

    }
}
