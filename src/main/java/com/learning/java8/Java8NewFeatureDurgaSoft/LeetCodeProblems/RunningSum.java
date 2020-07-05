package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==0){
                continue;
            }else{
                nums[i]=nums[i]+nums[i-1];
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RunningSum().runningSum(new int[]{1,2,3,4})));
    }
}
