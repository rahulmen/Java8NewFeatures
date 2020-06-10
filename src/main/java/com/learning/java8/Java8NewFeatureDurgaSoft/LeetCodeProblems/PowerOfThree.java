package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        double f = 3.0;
        double rem = n;
        while(rem / f > 1.0) {
            rem= rem/f;
        }
        if(rem==1.0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println(new PowerOfThree().isPowerOfThree(27));


    }

}
