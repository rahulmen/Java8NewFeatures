package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class HouseRobber {

    public int rob(int[] nums) {
        int sum1 = 0;
        int isEven = nums.length % 2;
        if (isEven == 0) {
            for (int i = 0; i < nums.length; i += 2) {
                //1 2 3 1
                if (i < nums.length - 2 && nums[i + 1] > nums[i] + nums[i + 2]) {
                    sum1 += nums[i + 1];
                    i = i + 1;
                } else if (i == nums.length - 2 && nums[i + 1] > nums[i]) {
                    sum1 += nums[i + 1];
                    i = i + 1;
                } else {
                    sum1 += nums[i];
                }
            }
        } else {
            for (int i = 0; i < nums.length; i += 2) {
                //1 2 3 1
                if (i < nums.length - 2 && nums[i + 1] > nums[i] + nums[i + 2]) {
                    sum1 += nums[i + 1];
                    i = i + 1;
                } else if (i == nums.length - 2 && nums[i + 1] > nums[i]) {
                    sum1 += nums[i + 1];
                    i = i + 1;
                } else {
                    sum1 += nums[i];
                }
            }
        }
        return sum1;
    }

    public static void main(String[] args) {
        System.out.println(new HouseRobber().rob(new int[]{8,10,4,12}));
    }

    //2 7 9 3 1
    //2 7 3 9 1
    //7 2 3 9 1
    //1,2,3,1


}
