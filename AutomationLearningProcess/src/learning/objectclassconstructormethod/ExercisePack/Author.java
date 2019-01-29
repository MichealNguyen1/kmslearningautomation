package learning.objectclassconstructormethod.ExercisePack;

/**
 * Created by trangtnnguyen on 1/28/2019.
 */
public class Author {
    //Instance variables
    String firstName, lastName;

    //Constructor
    public Author (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Instance methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return getFirstName()+" "+getLastName();
    }


}
