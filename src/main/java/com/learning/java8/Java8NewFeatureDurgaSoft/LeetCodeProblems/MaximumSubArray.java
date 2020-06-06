package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubArray {

        public int maxSubArray(int[] nums) {
            int max = nums[0];
            int sum = nums[0];

            for (int i = 1; i < nums.length; i++){
                if (sum < 0)
                    sum = nums[i];
                else
                    sum += nums[i];

                max = Math.max(sum, max);
            }

            return max;
        }


    public static void main(String[] args) {

        int Maxsum = new MaximumSubArray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});

        System.out.println(Maxsum);

    }

}
