package learning.files.io.exception.exercise.pack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 4. Write a Java program to append text to an existing file
 */
public class Exercise4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            File file = new File("fileioexercise.txt");
            //true means append text to the file
            //if false or not included means to write as new, not append
            fw = new FileWriter(file, true);
            fw.write("\nAppended text");
            fw.close();

            //Read the file content
            fr = new FileReader(file);
            int fileSize = (int) file.length();
            char[] a = new char[fileSize];
            fr.read(a);

            for (char c : a) {
                System.out.print(c);
            }
        } finally {
            if (fw != null) {
                fw.close();
            }
            if (fr != null) {
                fr.close();
            }
        }


    }
}
