package learning.files.io.exception;

import java.io.*;

/**
 * Created by trangtnnguyen on 2/14/2019.
 */
public class DataInput_Stream {
    public static void main(String args[])throws IOException {

        // writing string to a file encoded as modified UTF-8
        DataOutputStream dataOut = new DataOutputStream(
                new FileOutputStream("D:\\SourceForGit\\kmslearningautomation\\AutomationLearningProcess\\test.txt"));
        dataOut.writeUTF("hello");

        // Reading data from the same file
        DataInputStream dataIn = new DataInputStream(
                new FileInputStream("D:\\SourceForGit\\kmslearningautomation\\AutomationLearningProcess\\test.txt"));

        while(dataIn.available()>0) {
            String k = dataIn.readUTF();
            System.out.print(k+" ");
        }
    }
}
