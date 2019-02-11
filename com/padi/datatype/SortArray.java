package com.padi.datatype;

import java.util.Arrays;

public class SortArray<T> {

    void sortNumericArray(T[] a) {
        Arrays.sort(a);
        System.out.println("The sorted array: " + Arrays.toString(a));
    }
}

class TestSortArray{
    public static void main(String []args){
        Integer []numArray = {1,3,5,6,7,0};
        SortArray<Integer> sortNumArr = new SortArray<>();
        sortNumArr.sortNumericArray(numArray);

        String []stringArr = {"ME","MINE","I","MY","MOM"};
        SortArray<String> sortStringArr = new SortArray<>();
        sortStringArr.sortNumericArray(stringArr);
    }
}