package com.learning.java8.Java8NewFeatureDurgaSoft.Algorithms.Sorting;

import java.util.Arrays;

public class ArraySortingExample1 {

    static int[] arr = {4,6,7,2,4,5,7,2};

    public static void sort(){

        for(int i=1;i<arr.length;i++){
            int local = arr[i];
            int j= i-1;

            while(j>=0 && arr[j]>local){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=local;
        }
    }

    public static void main(String[] args) {

        ArraySortingExample1.sort();
        System.out.println(Arrays.toString(ArraySortingExample1.arr));

    }

}
