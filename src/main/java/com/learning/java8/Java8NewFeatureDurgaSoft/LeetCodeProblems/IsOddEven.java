package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class IsOddEven {

    public boolean isEven(int num){
        int temp = num&1;
        return temp==0?true:false;
    }

    public static void main(String[] args) {
        System.out.println(new IsOddEven().isEven(2));
    }
}
