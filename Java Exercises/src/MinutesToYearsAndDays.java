import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        int minutes;
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number of minutes: ");
        minutes = input.nextInt();

        int year = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440;

        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days");
    }
}
