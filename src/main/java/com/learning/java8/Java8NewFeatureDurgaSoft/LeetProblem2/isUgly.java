package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class isUgly {

    public boolean isUgly(int num) {
        if(num==1 || num==0) {
            return true;
        }
        else if(num%2==0){
            return isUgly(num/2);
        }else if(num%3==0){
            return isUgly(num/3);
        }else if(num%5==0){
            return isUgly(num/5);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new isUgly().isUgly(1));
    }
}
