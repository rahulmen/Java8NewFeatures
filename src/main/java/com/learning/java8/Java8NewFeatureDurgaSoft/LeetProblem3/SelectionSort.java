package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Arrays;

public class SelectionSort {

    public int[] selectionSort(int[] arr){

        int loop =0;
        while(loop<arr.length-1) {
            int index = 0;
            int min = Integer.MAX_VALUE;
            for (int i = loop; i < arr.length; i++) {
                if(arr[i]<min){
                    min = arr[i];
                    index = i;
                }
            }
            int temp = arr[index];
            arr[index]=arr[loop];
            arr[loop]=temp;
            loop++;
        }
        
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3,2,5,4,1,7,8,0};
        System.out.println(Arrays.toString(new SelectionSort().selectionSort(arr)));



    }
}
