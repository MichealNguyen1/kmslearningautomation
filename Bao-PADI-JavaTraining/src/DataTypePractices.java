import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRules;

public class DataTypePractices {

    float cDegree;
    int year;
    int day;

    public float ConvertFToC ( float fDegree ){
        cDegree = (fDegree - 32) * 5/9;
        return cDegree;
    }

    public void PrintDegree( float degree){
        System.out.println("The Celsius degree is "+degree);
    }

    public void ConvertMinutesToYearAndDay(int minute){
        year = minute/525600;
        day = (minute%525600)/(24*60);
    }

    public void PrintDate(int minute, int year, int day){
        System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days");
    }

    public void GetCurrentTimeInGMT( int timeZoneOffset){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        long offset = timeZoneOffset%24;
        ZoneId timeZone = ZoneId.of("GMT");
        ZonedDateTime timeNow = ZonedDateTime.now(timeZone).plusHours(offset);

        System.out.println("Current time with GMT time is " + dtf.format(timeNow));

    }

}
