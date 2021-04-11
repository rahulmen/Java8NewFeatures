package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Arrays;

public class ArraySorting {

    static int[] arr = {5,4,3,2,1,7,2,4,6,7,3,5,67};

    public static void sort(){
        for(int i =0;i<arr.length-1;i++){
            int j = i+1;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Array Before Sorting:"+Arrays.toString(arr));
        sort();
        System.out.println("Array After Sorting:"+Arrays.toString(arr));


    }
}
