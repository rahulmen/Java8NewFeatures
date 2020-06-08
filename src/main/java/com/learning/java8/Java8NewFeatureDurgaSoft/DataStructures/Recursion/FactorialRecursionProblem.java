package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

public class FactorialRecursionProblem {

    int sum=1;

    public int getFractionvalue(int num){
        if(num==0){
            return sum;
        }else{
            sum=sum*num;
            num = num-1;
            getFractionvalue(num);
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(new FactorialRecursionProblem().getFractionvalue(5));


    }
}
