package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        System.out.println(new RemoveDuplicate().removeDuplicates(new int[]{1,1,2,1}));

    }
}
