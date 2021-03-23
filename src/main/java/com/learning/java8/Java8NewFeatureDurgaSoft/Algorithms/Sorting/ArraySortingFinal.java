package com.learning.java8.Java8NewFeatureDurgaSoft.Algorithms.Sorting;

import java.util.Arrays;

public class ArraySortingFinal {

    static int[] arr = {4,2,4,5,3,2};

    public static void main(String[] args) {

        for(int i=1;i<arr.length;i++){
            int local = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>local){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=local;
        }

        System.out.println(Arrays.toString(arr));


    }

}
