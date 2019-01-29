package learning.objectclassconstructormethod.ExercisePack;

/**
 * Created by trangtnnguyen on 1/28/2019.
 */
public class Book {
    String title;
    Author author;
    double price;

    public Book (String title, Author name, double price){
        this.title = title;
        this.author = name;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return getTitle()+", "+getAuthor()+", "+"$"+getPrice();
    }
}
