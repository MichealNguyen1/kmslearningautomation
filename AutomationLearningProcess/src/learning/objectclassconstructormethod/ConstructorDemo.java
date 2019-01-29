package learning.objectclassconstructormethod;

/**
 * Created by trangtnnguyen on 1/28/2019.
 */
public class ConstructorDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        MyClass t3 = new MyClass(55);
        MyClass t4 = new MyClass(888);
        System.out.println(t1.num + " " + t2.num);
        System.out.println(t3.num);
        System.out.println(t4.num);
    }
}


