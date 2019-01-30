public class Book {
    // Variables
    public String title;
    public Author author;
    public double price;

    // Constructor
    public Book(String title, Author name, double price) {
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

    public String toString() {
        return "The details of the book are: " + title + ", " + author + "," + price + "";
    }
}



