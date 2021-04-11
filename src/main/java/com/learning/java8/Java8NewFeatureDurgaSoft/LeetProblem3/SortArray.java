package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Arrays;

public class SortArray {

    static int[] arr = {1,0,1,0,0,0,1,1,0,1,0,1,1,1,1,0,0,0,0,1,1};

    public static void sorting(){
        int i =0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }else if(arr[i]== arr[j] && arr[i]==0){
               i++;
               continue;
            }else if(arr[i]== arr[j] && arr[j]==1){
                j--;
                continue;
            }
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        SortArray.sorting();
        System.out.println(Arrays.toString(arr));
    }
}
