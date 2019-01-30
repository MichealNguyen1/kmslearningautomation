public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Developing Java Software",new Author("Russel","Winderand"), 79.75);
        System.out.println(myBook.toString());
    }
}

