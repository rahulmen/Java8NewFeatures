package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;

public class MoveZeroes {


    public void moveZeroes(int[] nums) {
        int i = 0;
        int zeroCount = 0;

        while (i < nums.length) {
            if (nums[i] == 0) {
                zeroCount++;
                i++;
                continue;
            }else{
                int temp = nums[i-zeroCount];
                 nums[i-zeroCount] = nums[i];
                nums[i]=temp;
                i=i-(zeroCount-1);
                zeroCount=0;
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = new int[]{0,1,0,3,12};
        new MoveZeroes().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
}
