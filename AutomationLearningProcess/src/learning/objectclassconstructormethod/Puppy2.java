package learning.objectclassconstructormethod;

/**
 * Created by trangtnnguyen on 1/28/2019.
 */
public class Puppy2 {
    int puppyAge;

    public Puppy2(String name) {
        // This constructor has one parameter, name.
        System.out.println("Name chosen is: " + name);
    }

    public static void main(String[] args) {
      /* Object creation */
        Puppy2 myPuppy = new Puppy2("tommy");

      /* Call class method to set puppy's age */
        myPuppy.setAge(2);

      /* Call another class method to get puppy's age */
        myPuppy.getAge();

      /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myPuppy.puppyAge);
    }

    public int getAge() {
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }

    public void setAge(int age) {
        puppyAge = age;
    }
}
