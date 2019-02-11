/**
 * @author Dai Vo
 * @since 02.06.2019
 */

public class Calculator {
    //Addition of x and y
    public void sum(double x, double y){
        System.out.println("Sum: " + Math.round(x+y));
      }
    //Multiple x and y
    public void mul(double x, double y){
        System.out.println("Mul: " + Math.round(x*y));
      }
}

class UseCalculator{
    public static void main(String []args){
        Calculator cal = new Calculator();
        cal.sum(3,4);
        cal.mul(7,8);
    }
}
