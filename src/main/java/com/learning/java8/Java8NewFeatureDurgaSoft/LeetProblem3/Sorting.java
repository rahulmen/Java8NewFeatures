package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Arrays;

public class Sorting {

    public int[] bubbleSort(int[] arr){
        boolean pass = true;
        while(pass){
            pass=false;
           for(int i=0;i<arr.length-1;i++) {
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

    public int[] selectionSort(int[] arr){
        int loop = 0;
        while(loop<arr.length-1) {
           int min = Integer.MAX_VALUE;
           int index = 0;
            for (int i = loop; i < arr.length; i++) {
                if(arr[i]<min){
                    min =arr[i];
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

    public int[] insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){

            int temp = arr[i];
            int j = i-1;

            while(j>-1 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,2,4,56,7,4,2,2,45,6,7};
        int[] arr2 = {4,2,4,56,7,4,2,2,45,6,7};
        int[] arr3 = {4,2,4,56,7,4,2,2,45,6,7};

        System.out.println(Arrays.toString(new Sorting().bubbleSort(arr1)));
        System.out.println(Arrays.toString(new Sorting().selectionSort(arr2)));
        System.out.println(Arrays.toString(new Sorting().insertionSort(arr3)));

    }


}
