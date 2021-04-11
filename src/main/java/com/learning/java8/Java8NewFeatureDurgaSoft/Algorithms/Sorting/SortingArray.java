package com.learning.java8.Java8NewFeatureDurgaSoft.Algorithms.Sorting;

import java.util.Arrays;

public class SortingArray {

    private static int[] arr = {2,4,2,4,5,3,4,4,2,3,45,5,2,34};

    private static void sort(){

        for(int i=1;i<arr.length;i++) {
            int local = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > local) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = local;
        }
    }

    public static void main(String[] args) {
        sort();
        System.out.println(Arrays.toString(arr));
    }

}
