package com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Utils;

import java.util.Arrays;

public class SortArray {

    private int[] sortArray(int[] ints) {

        for(int i=1;i<ints.length;i++){
            int local = ints[i];
            int j = i-1;

            while(j>=0 && ints[j]>local){
                ints[j+1]=ints[j];
                j--;
            }
            ints[j+1]=local;
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortArray().sortArray(new int[]{6, 5, 3, 1, 8, 7, 2, 4})));
    }


}
