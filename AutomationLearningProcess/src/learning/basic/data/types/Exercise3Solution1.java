package learning.basic.data.types;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Exercise3Solution1 {
    public static void main(String[] args)  {

        TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
        TimeZone.setDefault(gmtTimeZone);
        Calendar myCal = Calendar.getInstance(gmtTimeZone);
        Date myDate = myCal.getTime();

        SimpleDateFormat fTime = new SimpleDateFormat("HH:mm:ss");

        System.out.println("GMT time: "+fTime.format(myDate));
        System.out.print("Input the time zone offset to GMT: ");
        Scanner sc = new Scanner(System.in);
        int offset = sc.nextInt();

        ZoneId z = ZoneId.ofOffset("UTC", ZoneOffset.ofHours(offset%24));
        System.out.println("GMT time with offset: "+(LocalDateTime.ofInstant(Instant.now(),z)).format(DateTimeFormatter.ofPattern("HH:mm:ss")));


    }
}
