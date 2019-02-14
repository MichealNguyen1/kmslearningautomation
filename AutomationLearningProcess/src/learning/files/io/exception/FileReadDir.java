package learning.files.io.exception;

import java.io.File;

/**
 * Created by trangtnnguyen on 2/14/2019.
 */
public class FileReadDir {
    public static void main(String[] args) {
        File file = null;
        String[] paths;

        try {
            // create new file object
            file = new File("tmp\\trangtest");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}
