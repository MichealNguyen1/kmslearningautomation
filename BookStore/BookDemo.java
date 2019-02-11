package BookStore;

public class BookDemo {
    public static void main(String args[]){
        Book book = new Book("Developing Java Software", new Author("Russel","Winderand"), 79.57);
        System.out.print(book.toString());
    }
}

class Book {
    private String title;
    private Author name;
    private double price;

    public Book(String title,Author name,double price){
        this.title = title;
        this.name = name;
        this.price = price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(Author author){
        name = author;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return  "Book's detail: "+ title + ", " + name.getFirstName() + " " + name.getLastName() + ", " + price;
    }
}
