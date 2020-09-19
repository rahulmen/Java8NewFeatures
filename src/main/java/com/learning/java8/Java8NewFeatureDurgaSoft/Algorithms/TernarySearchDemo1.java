package com.learning.java8.Java8NewFeatureDurgaSoft.Algorithms;

import java.util.Arrays;

public class TernarySearchDemo1 {

    public int ternarySearch(int[] arr,int num){
        Arrays.sort(arr);

        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid1 = i+(j-i)/3;
            int mid2 = j-(j-i)/3;
               if(arr[mid1]==num){
                   return mid1;
               }else if(arr[mid2]==num){
                   return mid2;
               }else if(num<arr[mid1]){
                   j=mid1-1;
               }else if(num>arr[mid2]){
                   i=mid2+1;
               }else{
                   i=mid1+1;
                   j=mid2-1;
               }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {

        System.out.println(new TernarySearchDemo1().ternarySearch(new int[]{6,8,9,2,3,5,4,1},3));
    }
}
