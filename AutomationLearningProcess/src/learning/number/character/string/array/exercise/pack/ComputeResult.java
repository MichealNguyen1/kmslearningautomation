package learning.number.character.string.array.exercise.pack;

/**
 * Created by trangtnnguyen on 2/13/2019.
 */
public class ComputeResult {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a'); //5


/*1*/ result.setCharAt(0, original.charAt(0)); //result = si
        //System.out.println(result);
/*2*/ result.setCharAt(1, original.charAt(original.length()-1));//result = se
        //System.out.println(result);
/*3*/ result.insert(1, original.charAt(4));//result = swe
        //System.out.println(result);
/*4*/ result.append(original.substring(1,4));//result = sweoft
       // System.out.println(result);
/*5*/ result.insert(3, (original.substring(index, index+2) + " "));//result = swear oft


        System.out.println(result);
    }
}
