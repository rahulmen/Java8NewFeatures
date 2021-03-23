package com.learning.java8.Java8NewFeatureDurgaSoft.PhonePe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question3 {

    public static void sort(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }else if(arr[i]==1 && arr[j]==1){
                j--;
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {1,1,0,1,0,1};
        Question3.sort(arr);
        int number = 2; //[1,4],[2,3]

        Set<Integer> set = new HashSet<>();
        for(int i:arr){
        if(set.contains(number-i)){
            System.out.println(i+","+(number-i));
        }else{
            set.add(i);
        }
        }


    }

}
