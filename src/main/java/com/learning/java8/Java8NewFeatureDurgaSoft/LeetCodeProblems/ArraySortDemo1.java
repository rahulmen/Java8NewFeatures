package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySortDemo1 {
    static int[] temp = {5,4,3,2,1};

    public static void main(String[] args) {

        for(int i=0;i<temp.length-1;i++){

            if(temp[i]>temp[i+1]){
                int local = temp[i];
                temp[i]=temp[i+1];
                temp[i+1]=local;
                i=-1;
            }
        }

        System.out.println(Arrays.toString(temp));
    }


}
