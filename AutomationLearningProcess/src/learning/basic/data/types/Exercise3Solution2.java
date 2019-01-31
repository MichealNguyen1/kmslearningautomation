package learning.basic.data.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Exercise3Solution2 {

    String currentTimeWithOffset;
    Date fCurrentTimeWithOffset;
    long hourWithOffset, minWithOffset, secWithOffset;
    SimpleDateFormat dateFormat;
    int offset;


    public static void main(String[] args) throws ParseException {
        Exercise3Solution2 a = new Exercise3Solution2();
        a.printTime();
    }

    public void printTime() throws ParseException {
        TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
        TimeZone.setDefault(gmtTimeZone);
        Calendar myCal = Calendar.getInstance(gmtTimeZone);
        Date myDate = myCal.getTime();

        dateFormat = new SimpleDateFormat("HH:mm:ss");
        String fDate1 = dateFormat.format(myDate);
        System.out.println("Current datetime in GMT: " + fDate1);

        System.out.print("Input the time zone offset to GMT: ");
        Scanner sc = new Scanner(System.in);
        offset = sc.nextInt();

        hourWithOffset = LocalDateTime.now().getHour() + offset;
        minWithOffset = LocalDateTime.now().getMinute();
        secWithOffset = LocalDateTime.now().getSecond();

        //Calculate time if hourWithOffset >= 24
        if (hourWithOffset >= 24) {
            hourWithOffset = hourWithOffset % 24;
            currentTimeWithOffset = hourWithOffset + ":" + minWithOffset + ":" + secWithOffset;
            fCurrentTimeWithOffset = dateFormat.parse(currentTimeWithOffset);
            System.out.println("Current GMT time with offset: " + dateFormat.format(fCurrentTimeWithOffset));

        } else if (hourWithOffset < 0) { //Calculate time if hourWithOffset < 0
            hourWithOffset = (-offset % 24) - LocalDateTime.now().getHour();
            currentTimeWithOffset = hourWithOffset + ":" + minWithOffset + ":" + secWithOffset;
            fCurrentTimeWithOffset = dateFormat.parse(currentTimeWithOffset);
            System.out.println("Current GMT datetime with offset: " + dateFormat.format(fCurrentTimeWithOffset));
        } else {
            currentTimeWithOffset = hourWithOffset + ":" + minWithOffset + ":" + secWithOffset;
            fCurrentTimeWithOffset = dateFormat.parse(currentTimeWithOffset);
            System.out.println("Current GMT datetime with offset: " + dateFormat.format(fCurrentTimeWithOffset));
        }
    }


}
