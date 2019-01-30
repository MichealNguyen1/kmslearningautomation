/*
Exercise 3 - Thuy Vu
 */
public class Author {

    // Instance variables

    public String firstName;
    public String lastName;

    // Constructor
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Instance Methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String toString(){
        return firstName + " " + lastName;
    }
}