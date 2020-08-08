package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class JavaMaxAverageSubArray {

    public double findMaxAverage(int[] nums, int k) {

        int sum =0;
        int maxSum=Integer.MIN_VALUE;
        int j=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i>=k-1){
                if(sum>maxSum){
                    maxSum=sum;
                }
                sum=sum-nums[j];
                j++;
            }
        }
        return (maxSum+0.0)/k;


    }

    public static void main(String[] args) {

        System.out.println(new JavaMaxAverageSubArray().findMaxAverage(new int[]{1,12,-5,-6,50,3},4));

    }

}
