/**
 * @author daivo
 * @version 1.0
 * @since 2019-01-28
 */
class Date {
    enum DoW{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    DoW day;
}

public class Enum {
    public static void main(String args[]) {
        Date dating = new Date();
        Date salary = new Date();
        salary.day = dating.day.MONDAY;
        /* Practice Array and Enum */
        Date[] week = new Date[7];
        week[0] = new Date();
        week[0].day = dating.day.TUESDAY;
        System.out.println("Date for salary: " + salary.day);
        System.out.println("Date for dating: " + dating.day.WEDNESDAY);
        System.out.println("2nd day of the 1st week: " + week[0].day);
    }
}