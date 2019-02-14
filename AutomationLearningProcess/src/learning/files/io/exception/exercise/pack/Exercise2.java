package learning.files.io.exception.exercise.pack;

import java.io.File;

/**
 *  Write a Java program to check if given pathname is a directory or a file
 */
public class Exercise2 {
    public static void main(String[] args) {
        String[] paths = {"tmp\\trangtest",
                           "tmp\\trangtest\\a.txt",
                            "tmp\\bbbbbb"};

        for (String path:paths ){
            File f = new File(path);
            if(f.isDirectory()){
                System.out.println(f.getAbsolutePath()+" is a directory");
            }
            else if(f.isFile()){
                System.out.println(f.getAbsolutePath()+" is a file");
            }
            else {
                System.out.println(f.getAbsolutePath()+" Directory/File not found");
            }
        }
    }
}
