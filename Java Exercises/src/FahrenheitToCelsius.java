import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float fahrenheit;
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        fahrenheit = input.nextFloat();

        float celsius = ((fahrenheit - 32)*5)/9;

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
