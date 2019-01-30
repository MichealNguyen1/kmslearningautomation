import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class CurrentTimeInGMT {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        //System.out.println("Current time in GMT is " + currentHour + ":" + currentMinute + ":" + currentSecond);
        System.out.println(System.currentTimeMillis());
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneOffset = input.nextInt();

        long remainingHour = timeZoneOffset%24;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        ZoneId gmtZone = ZoneId.of("GMT");
        ZonedDateTime currentHour = ZonedDateTime.now(gmtZone).plusHours(remainingHour);

        System.out.println("Current time with GMT time is: " + dtf.format(currentHour));
    }
}
