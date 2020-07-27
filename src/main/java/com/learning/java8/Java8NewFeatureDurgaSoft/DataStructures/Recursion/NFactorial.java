package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

public class NFactorial {

    public int sum(int num){
        if(num==0){
            return 1;
        }else{
            System.out.println(num);
            return num*sum(num-1);
        }

    }

    public static void main(String[] args) {

        System.out.println(new NFactorial().sum(6));

    }
}
