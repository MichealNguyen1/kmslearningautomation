package learning.objectclassconstructormethod.ExercisePack;


/**
 * Created by trangtnnguyen on 1/28/2019.
 */
public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Developing Java Software", new Author("Russel","Winderand"),79.75);

        //Solution 1
        System.out.println(b1.toString());
        System.out.println("************************************");

        //Solution 2
        System.out.println(b1.title);
        System.out.println(b1.author.toString());
        System.out.println("$"+b1.price);
        System.out.println("************************************");

        //Solution 3
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor().toString());
        System.out.println("$"+b1.getPrice());
        System.out.println("************************************");

    }
}
