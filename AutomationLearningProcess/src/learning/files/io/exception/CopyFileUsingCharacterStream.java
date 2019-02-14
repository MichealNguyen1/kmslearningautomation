package learning.files.io.exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by trangtnnguyen on 2/13/2019.
 */
public class CopyFileUsingCharacterStream {
    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("input2.txt");
            out = new FileWriter("output2.txt");

            int c;
            // Returns of read(): the total number of bytes read into the buffer,
            // or -1 if there is no more data because the end of the file has been reached.
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {

            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }

        }
    }
}
