package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){

            int j = i-1;
            int temp = arr[i];
            while(j>-1 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3,2,5,4,1,7,8,0};
        System.out.println(Arrays.toString(new InsertionSort().insertionSort(arr)));



    }
}
