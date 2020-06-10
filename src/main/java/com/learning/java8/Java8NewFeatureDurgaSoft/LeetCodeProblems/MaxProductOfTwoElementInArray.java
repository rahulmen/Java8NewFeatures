package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class MaxProductOfTwoElementInArray {

    public int maxProduct(int[] nums) {
        int firstMax=1;
        int secondMax=0;

        for(int i=0;i<nums.length;i++){

           if(nums[i]>=firstMax){
               secondMax=firstMax;
               firstMax=nums[i];
            }else if(nums[i]<firstMax && nums[i]>secondMax){
               secondMax=nums[i];
           }
        }
        return (firstMax-1)*(secondMax-1);
    }


    public static void main(String[] args) {
        System.out.println(new MaxProductOfTwoElementInArray().maxProduct(new int[]{1,5,4,5}));
    }
}
