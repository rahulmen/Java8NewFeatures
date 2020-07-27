package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTrackingExample1 {

    static char[] arr = new char[7];

    public void Binary(int n){
        if(n<1){
            System.out.println(Arrays.toString(arr));
        }else{
            arr[n-1]='a';
            Binary(n-1);
            arr[n-1]='b';
            Binary(n-1);
        }
    }

    public static void main(String[] args) {
        new BackTrackingExample1().Binary(arr.length);
    }
}
