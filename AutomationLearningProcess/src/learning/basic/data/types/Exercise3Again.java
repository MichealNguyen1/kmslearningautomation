package learning.basic.data.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;


/**
 * Created by trangtnnguyen on 1/30/2019.
 */
public class Exercise3Again {

    public static void main(String[] args) throws ParseException {
        TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
        TimeZone.setDefault(gmtTimeZone);
        Calendar myCal = Calendar.getInstance(gmtTimeZone);
        Date myDate = myCal.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String fDate1 = dateFormat.format(myDate);
        System.out.println("Current datetime in GMT: "+fDate1);

        System.out.print("Input the time zone offset to GMT: ");
        Scanner sc = new Scanner(System.in);
        int offset = sc.nextInt();

        long hourWithOffset = LocalDateTime.now().getHour()+offset;
        long minWithOffset = LocalDateTime.now().getMinute();
        long secWithOffset = LocalDateTime.now().getSecond();

        String currentTimeWithOffset;
        Date fCurrentTimeWithOffset;

        //Calculate time if hourWithOffset >= 24
        if(hourWithOffset>=24){
            hourWithOffset = hourWithOffset % 24;
            currentTimeWithOffset = hourWithOffset+":"+minWithOffset+":"+secWithOffset;
            fCurrentTimeWithOffset = dateFormat.parse(currentTimeWithOffset);
            System.out.println("Current GMT time with offset: "+dateFormat.format(fCurrentTimeWithOffset));

        }else if(hourWithOffset<0){ //Calculate time if hourWithOffset < 0
            hourWithOffset = (-offset % 24) - LocalDateTime.now().getHour();
            currentTimeWithOffset = hourWithOffset+":"+minWithOffset+":"+secWithOffset;
            fCurrentTimeWithOffset = dateFormat.parse(currentTimeWithOffset);
            System.out.println("Current GMT datetime with offset: "+dateFormat.format(fCurrentTimeWithOffset));
        }
        else{
            currentTimeWithOffset = hourWithOffset + ":" + minWithOffset + ":" + secWithOffset;
            fCurrentTimeWithOffset = dateFormat.parse(currentTimeWithOffset);
            System.out.println("Current GMT datetime with offset: " + dateFormat.format(fCurrentTimeWithOffset));
        }

    }

}
