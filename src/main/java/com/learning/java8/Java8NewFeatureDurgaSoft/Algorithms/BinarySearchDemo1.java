package com.learning.java8.Java8NewFeatureDurgaSoft.Algorithms;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import java.util.Arrays;

public class BinarySearchDemo1 {

    public int binarySearch(int[] arr,int num){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid = (i+j)/2+1;
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid]>num){
                j=mid-1;
            }else if(arr[mid]<num){
                i=mid+1;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {

        System.out.println(new BinarySearchDemo1().binarySearch(new int[]{6,8,9,2,3,5,4,1},3432));


    }
}
