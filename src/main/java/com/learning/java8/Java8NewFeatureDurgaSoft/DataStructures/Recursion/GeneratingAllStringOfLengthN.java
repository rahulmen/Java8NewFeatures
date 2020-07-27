package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

import java.util.Arrays;

public class GeneratingAllStringOfLengthN {

    int[] arr = new int[5];

    public void K_String(int n,int k) {
    if(n<1){
        System.out.println(Arrays.toString(arr));
    }else{
        for(int j=0;j<k;j++){
            arr[n-1]=j;
            K_String(n-1,k);
        }
    }
    }



    public static void main(String[] args) {
        new GeneratingAllStringOfLengthN().K_String(5,3);
    }
}
