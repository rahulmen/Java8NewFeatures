package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class SingleNumber {

    public int singleNumber(int[] nums) {
       int a = 0;
       for(int i:nums) {
           a = a ^ i;
       }
       return a;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[]{2,2,1,3,3,4,4,1}));
    }
}
