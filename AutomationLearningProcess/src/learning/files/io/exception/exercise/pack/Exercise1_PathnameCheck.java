package learning.files.io.exception.exercise.pack;

import java.io.File;

/**
 * Write a Java program to check if a file or directory specified by pathname exists or not
 */
public class Exercise1_PathnameCheck {
    public static void main(String[] args) {
        String[] paths = {"tmp\\trangtest",
                            "tmp\\trangtest\\a.txt",
                            "tmp\\bbbbbb"};

        for (String path:paths ){
            File f = new File(path);
            if(f.exists()){
                System.out.println(f.getAbsolutePath()+" exists");
            }else {
                    System.out.println(f.getAbsolutePath() + " Not exist");
            }
        }


    }
}
