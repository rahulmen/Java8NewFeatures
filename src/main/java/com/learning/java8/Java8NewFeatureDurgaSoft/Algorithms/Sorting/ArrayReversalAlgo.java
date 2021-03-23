package com.learning.java8.Java8NewFeatureDurgaSoft.Algorithms.Sorting;

import java.util.Arrays;

public class ArrayReversalAlgo {

    static int[] arr = {4,6,7,2,4,5,7};

    public static void reverse(){

        int i=0;int j=arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }


    public static void main(String[] args) {
        ArrayReversalAlgo.reverse();
        System.out.println(Arrays.toString(ArrayReversalAlgo.arr));
    }

}
