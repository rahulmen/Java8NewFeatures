package com.learning.java8.Java8NewFeatureDurgaSoft.Algorithms.Sorting;

import java.util.Arrays;

public class ArraySorting {

    public void sort(int[] arr){

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

    public int binarySearch(int[] arr,int element){

        int returnIndex = Integer.MIN_VALUE;

        int i=0,j=arr.length-1;
        while(i<=j){
            int mid =(i+j)/2+1;
            if(arr[mid]==element){
                return mid;
            }
            else if(element>arr[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return returnIndex;
    }

    public static void main(String[] args) {

        int[] arr = {8,7,4,5,23,4,28};
        ArraySorting arraySorting = new ArraySorting();
        arraySorting.sort(arr);
        System.out.println(arraySorting.binarySearch(arr,28));
    }
}
