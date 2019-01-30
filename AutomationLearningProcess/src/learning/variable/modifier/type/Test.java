package learning.variable.modifier.type;

/**
 * Created by trangtnnguyen on 1/30/2019.
 */
public class Test {
    public void pupAge() {
        int age =0 ;//local variable
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        Test test = new Test();
        test.pupAge();
    }
}
