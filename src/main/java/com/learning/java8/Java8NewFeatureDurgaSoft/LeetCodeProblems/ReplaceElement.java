package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;

public class ReplaceElement {

    public int[] replaceElements(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            int max = Integer.MIN_VALUE;
            int k=arr.length-1;
            while(j<=k){
                int temp;
                if(arr[j]>arr[k]){
                    temp = arr[j];
                }else{
                    temp = arr[k];
                }
                if(temp>max){
                    max=temp;
                }
                j++;
                k--;
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        return arr;
    }

    public int[] replaceElements1(int[] arr) {

        //17,18,5,4,6,1

        //17,18,5,4,1,-1  6
        //17,18,5,6,1,-1  6
        //17,18,6,6,1,-1  6
        //17,6,6,6,1,-1   18
        //18,6,6,6,1,-1    18

        int num = arr[arr.length - 1];
        if(arr.length >= 2){
            if(num < arr[arr.length - 2])
                num = arr[arr.length - 2];
            arr[arr.length - 2] = arr[arr.length - 1];
            arr[arr.length - 1] = -1;

            int current;

            for(int i = arr.length - 3; i >= 0; i--){
                current = arr[i];
                if(arr[i] < num){
                    arr[i] = num;
                }else{
                    arr[i] = num;
                    num = current;
                }
            }
        }else{
            arr[arr.length - 1] = -1;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ReplaceElement().replaceElements1(new int[]{17,18,5,4,6,1})));
    }
}
