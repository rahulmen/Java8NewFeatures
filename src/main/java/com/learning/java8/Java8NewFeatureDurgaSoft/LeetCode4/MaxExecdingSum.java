package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCode4;

public class MaxExecdingSum {

        public int maxAscendingSum(int[] nums) {

            int i = nums.length-1;
            int maxSum = Integer.MIN_VALUE;
            int localSum = 0;
            while(i>=0){
                if(i>0 && nums[i]>nums[i-1]){
                    localSum+=(nums[i]);
                }else{
                    if(i!=nums.length-1 && nums[i]<nums[i+1]){
                        localSum+=(nums[i]);
                        if(localSum>maxSum){
                            maxSum=localSum;
                        }
                    }else{
                        localSum = nums[i];
                        if(localSum>maxSum){
                            maxSum=localSum;
                        }
                    }
                    localSum=0;

                }
                i--;
            }
            return maxSum;
        }

    public static void main(String[] args) {
        System.out.println(new MaxExecdingSum().maxAscendingSum(new int[]{12,17,15,13,10,11,12}));

        String s = "Rqhul";


        }

}

