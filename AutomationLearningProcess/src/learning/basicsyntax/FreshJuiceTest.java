package learning.basicsyntax;

/**
 * Created by trangtnnguyen on 1/25/2019.
 */
public class FreshJuiceTest {
    public static void main(String args[]) {
        FreshJuice juice = new FreshJuice();

        //set a value for juice variable
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
        System.out.println("Size: " + juice.size);
    }
}
