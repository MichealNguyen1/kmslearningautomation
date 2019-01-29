import java.util.Random;
import java.util.Scanner;

enum TshirtSize{
    S,
    XS,
    M,
    L,
    XL}

class Author {
    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    @Override
    public String toString() {
        return firstName+"..."+lastName;
    }
}

class Book {
    String title;
    Author author;
    double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
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

    @Override
    public String toString() {
        //return super.toString();
        return title+"\n"+author+"\n"+price;
    }
}


public class BookDemo {
    public static void main(String[] args) {

        int firstNum = 74;
        int secondNum = 36;

        TshirtSize baoSize;

        Author author = new Author("","");
        author.setFirstName("Bao");
        author.setLastName("Tran");

        Book book = new Book("", author, 0);
        book.setTitle("Developing Java Software");
        book.setPrice(79.75);

        baoSize = TshirtSize.XL;
        //BaoSize = 1; Compilation error

        System.out.println("Hello World! \nAlexandra Abramov");
        System.out.println(firstNum + secondNum);
        System.out.println(baoSize);

        System.out.println(book);

    }
}
