import java.util.Scanner;
public class SumNumbers {
        public static void main (String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Nhap so thu nhat: ");
            int num1 = input.nextInt();
            System.out.println("Nhap so thu hai: ");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("Tong la: " + sum);
        }
}
