package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class SingleNumber {


    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }

    public static void main(String[] args) {

            System.out.println(new SingleNumber().singleNumber(new int[] {4,1,2,1,2}));

    }
}
