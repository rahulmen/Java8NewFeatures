package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

import com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3.SortArray;

import java.util.Arrays;

public class SortArraySomeValue {

    public int[] sort(int[] arr){
       int[] temp = arr;

       int i=0;
       int j=i+1;
       int k = arr.length-1;
        //2,1,0,1,2,1,0,0
        //0,1,0,1,2,1,0,2

       while(i<j) {
           if (arr[i] > arr[j] && arr[j]>arr[k]) {
               int swap = arr[i];
               arr[i] = arr[k];
               arr[k] = swap;
               i++;
               j++;
               k--;
           } else if (arr[i]>arr[j] && arr[i]<arr[j]) {
               int swap = arr[i];
               arr[i] = arr[j];
               arr[j] = swap;

           } else {
               i++;
           }
       }
        return temp;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new SortArraySomeValue().sort(new int[]{1,0,1,1,0,1})));



    }
}
