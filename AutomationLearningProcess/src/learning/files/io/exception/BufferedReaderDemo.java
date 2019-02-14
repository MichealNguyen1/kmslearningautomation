package learning.files.io.exception;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by trangtnnguyen on 2/14/2019.
 */
public class BufferedReaderDemo {
    private static final String FILENAME = "fileioexercise3.txt";

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;
        try {
            //br = new BufferedReaderDemo(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}
