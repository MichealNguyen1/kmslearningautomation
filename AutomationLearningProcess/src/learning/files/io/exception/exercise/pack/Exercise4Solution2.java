package learning.files.io.exception.exercise.pack;

import java.io.*;

/**
 * 4. Write a Java program to append text to an existing file
 */
public class Exercise4Solution2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //Append text to file
            File file = new File("fileioexercise2.txt");
            Writer writer = new FileWriter(file, true);
            String appendText = "\nAppended";
            bw = new BufferedWriter(writer);
            bw.write(appendText);
            bw.flush();

            //Read the file
            Reader reader = new FileReader(file);
            br = new BufferedReader(reader);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }
        }

    }
}
