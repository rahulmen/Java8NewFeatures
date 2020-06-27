package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

public class FactorialRecursionProblem {


    int sum=1;

    public long Factorial(int num){
        if(num==0){
            return 1;
        }else{
            return num*Factorial(num-1);
        }
    }


    public static void main(String[] args) {

        System.out.println(new FactorialRecursionProblem().Factorial(9));


    }

}
