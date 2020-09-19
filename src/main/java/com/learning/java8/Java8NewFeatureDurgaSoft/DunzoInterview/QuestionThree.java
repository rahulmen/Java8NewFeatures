package com.learning.java8.Java8NewFeatureDurgaSoft.DunzoInterview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionThree {

    public static void swap(int[] arr,int count, int index) {
        int temp = arr[count];
        arr[count] = arr[index];
        arr[index] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3,2,1,1,2,3,3,2,1};

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){

            if(array[i]<min1){
                min3=min2;
                min2=min1;
                min1=array[i];
            }else if(array[i]<min2 && array[i]>min1){
                min3=min2;
                min2=array[i];
            }else if(array[i]<min3 && array[i]>min2){
                min3=array[i];
            }
        }

        int low=0;
        int mid=0;
        int high = array.length-1;

        while(mid<=high){
            if(array[mid]==min1){
                swap(array,low,mid);
                low++;
                mid++;
            }else if(array[mid]==min3){
                swap(array,high,mid);
                high--;
            }else if(array[mid]==min2){
                mid++;
            }
        }

        System.out.println(Arrays.toString(array));


    }

}
