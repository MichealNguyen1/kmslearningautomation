package learning.number.character.string.array;

/**
 * Created by trangtnnguyen on 2/13/2019.
 */
public class StringDemo {
    public static void main(String args[]) {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println( helloString );


        String string1 = "This is Trang Nguyen. ";
        int length = string1.length();
        System.out.println("Length of string1 is: "+length);

        String string2 = "KMS Technology.";
        System.out.println(string1.concat(string2));
        System.out.println("ABCD!!!!!!!"+string1+string2);
    }
}
