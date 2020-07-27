package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
       int counter =0;

       for(int i=0;i<nums.length-1;i++){
               if (nums[i] > nums[i + 1]) {
                   if(i>0) {
                   if (nums[i - 1] <= nums[i+1]) {
                       nums[i + 1] = nums[i - 1];

                   } else {
                       nums[i + 1] = nums[i];

                   }
               }
               counter++;
           }
       }
       if(counter>1){
           return false;
       }
       return true;
    }

    public static void main(String[] args) {

        System.out.println(new NonDecreasingArray().checkPossibility(new int[]{2,2,1,1}));

    }
}
