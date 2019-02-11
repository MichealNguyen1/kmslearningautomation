package com.padi.File;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class CheckFile {
    private File pathname;

    CheckFile(File pathname){
        this.pathname = pathname;
    }

    void checkExistFile(){
        if (pathname.exists())
            System.out.println("The directory or file exists");
        else {
            System.out.println("The directory or file does not exist");
        }
    }

    void checkFile(){
        if (pathname.isFile())
           System.out.println("The " + pathname + " is a file");
        else
            System.out.println("The " + pathname + " is a directory");
    }

    void storeText2Arr(){
        List<String> arrlist = new ArrayList<>();
        String getLine;
        try {
            Scanner readFile = new Scanner(pathname);
            while (readFile.hasNextLine()) {
                getLine = readFile.nextLine();
                arrlist.add(getLine);
            }
            readFile.close();
            String[] stringArr = arrlist.toArray(new String[0]);
            System.out.println("The Result is: " + Arrays.toString(stringArr));
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            e.printStackTrace();
        }
    }

    void append2File(){
        System.out.println("4. Input an example: ");
        Scanner data = new Scanner(System.in);
        String content = data.nextLine();
        System.out.println(content);
        try {
            if (!pathname.exists()) pathname.createNewFile();
            FileWriter fw = new FileWriter(pathname, true);
//            fw.write(content);
//            fw.close();
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("Please check with storeText2Array function");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

class TestCheckFile{
    public static void main(String []args){
        System.out.print("Input a pathname: ");
        Scanner inPathName = new Scanner(System.in);
        File pathname = new File(inPathName.nextLine());
        CheckFile check = new CheckFile(pathname);
        //check File or Directory exists
        //check.checkExistFile();
        //check File is a directory or a file
        //check.checkFile();
        //read and store the text file line by line
        //check.storeText2Arr();
        //append text to a file
        check.append2File();
        check.storeText2Arr();
    }
}
