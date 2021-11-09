package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] arr){

        boolean pass = true;
        while(pass==true) {
            pass = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    pass = true;
                }
            }
        }
    return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3,2,5,4,1,7,8,0};
        System.out.println(Arrays.toString(new BubbleSort().bubbleSort(arr)));



    }

}
