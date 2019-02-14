package learning.files.io.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by trangtnnguyen on 2/13/2019.
 */
public class CopyFileUsingByteStream {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        FileInputStream in2 =null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            // Returns of read(): the total number of bytes read into the buffer,
            // or -1 if there is no more data because the end of the file has been reached.

            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println((char) c);

            }
            System.out.println(in.toString());
        }finally {
            /*
            //The main point for this is because you don't want to lock up the files if they are not closed
            // and the reason for checking if they are null is because if one of the files was not found to begin with
            // then it would cause an error if you are trying to close something that does not exist.
            if (in != null) {//close the stream that is not null only, ones that are null should be ignored
                in.close();
            }
            if (out != null) {
                out.close();
            }
*/
            in2.close();//error thrown because Java cannot close a file that is not exited.
            in.close();
            out.close();

        }
    }
}
