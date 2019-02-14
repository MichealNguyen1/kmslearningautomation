package learning.files.io.exception.exercise.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 3. Write a Java program to store text file content line by line into an array.
 */
public class Exercise3 {
    public static void main(String[] args) throws IOException {
            File file = new File("fileioexercise.txt");
            FileReader fr = new FileReader(file);

            //Get size of the file to read
            int size = (int)file.length();

            //Create an array string to store the content of the file
            char [] a = new char[size];

            // Read the content to the array
            fr.read(a);

            for(char c : a){
                // Print the characters one by one
                System.out.print(c);
            }
            fr.close();
    }
}
