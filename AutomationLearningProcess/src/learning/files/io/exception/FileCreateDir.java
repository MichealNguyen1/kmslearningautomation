package learning.files.io.exception;

import java.io.File;

/**
 * Created by trangtnnguyen on 2/14/2019.
 */
public class FileCreateDir {
    public static void main(String args[]) {
        String dirname = "tmp/trangtest/abc";
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();
    }
}
