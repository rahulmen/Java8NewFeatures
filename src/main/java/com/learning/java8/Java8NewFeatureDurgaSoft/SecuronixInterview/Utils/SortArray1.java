package com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Utils;

import java.util.Arrays;


public class SortArray1 {

    public int[] sortArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            int number = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>number){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=number;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortArray1().sortArray(new int[]{6, 5, 3, 1, 8, 7, 2, 4})));
    }
}
