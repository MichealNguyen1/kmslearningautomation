public class BookDemo1 {
    public static void main(String[] args) {
        Book1 myBook = new Book1("Developing Java Software",new Author1("Russel","Winderand"), 79.75);
        System.out.println(myBook.toString());
    }
}

class Author1 {
    String firstName;
    String lastName;

    //Contructor here
    public Author1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Instance methods start here
    public void setFirstName (String firstName) {
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

    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}

class Book1 {
    String title;
    Author1 author;
    double price;

    //Contructor here
    public Book1 (String title, Author1 name, double price) {
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

    public void setAuthor(Author1 author) {
        this.author = author;
    }

    public Author1 getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Book's Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPrice: " + getPrice();
    }
}


