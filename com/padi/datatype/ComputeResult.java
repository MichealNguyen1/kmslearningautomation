package com.padi.datatype;

public class ComputeResult {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');


        /*1*/ result.setCharAt(0, original.charAt(0)); //si
        /*2*/ result.setCharAt(1, original.charAt(original.length()-1)); //se
//        /*3*/ result.insert(1, original.charAt(4)); //hwi
//        /*4*/ result.append(original.substring(1,4)); //hioft
      //  /*5*/ result.insert(3, (original.substring(index, index+2) + " ")); //fail ; offset:2 -> //"hiar "

       // System.out.println(Integer.valueOf(1).equals(1));


        System.out.println(result);
    }
}
