public class Book {
    String title;
    Author author;
    double price;

    //Contructor here
    public Book (String title, Author name, double price) {
        this.title = title;
        this.author = name;
        this.price = price;
    }

    //instance methods start here

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
         return "Book's Name: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPrice: " + getPrice();
    }
}
