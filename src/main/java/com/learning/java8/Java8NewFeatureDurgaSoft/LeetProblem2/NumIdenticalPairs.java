package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class NumIdenticalPairs {

    public int numIdenticalPairs(int[] nums) {
        int pair =0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    pair++;
                }
            }
        }
        return pair;
    }

    public static void main(String[] args) {

        System.out.println(new NumIdenticalPairs().numIdenticalPairs(new int[]{1,2,3,1,1,3}));

    }

}
