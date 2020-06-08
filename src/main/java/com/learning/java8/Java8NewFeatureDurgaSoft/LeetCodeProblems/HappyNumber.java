package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.HashSet;

public class HappyNumber {

    HashSet<Integer> hashSet = new HashSet<>();

    public boolean isHappy(int n) {
            int num = 0;
            if (n == 1) {
                return true;
            } else {
                while (n >= 1) {
                    int rem = n % 10;
                    num = num + (rem * rem);
                    n = n / 10;
                }
                if(hashSet.contains(num)){
                    return false;
                }else{
                    hashSet.add(num);
                    return isHappy(num);
                }
            }
    }


    public static void main(String[] args) {

        System.out.println(new HappyNumber().isHappy(35));


    }
}
