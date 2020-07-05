package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class NumberOfStepsTillZero {

    int steps=0;
    public int numberOfSteps (int num) {
        if(num==0){
            return steps;
        }
        else if(num%2==0){
            num = num/2;
            steps++;
            return numberOfSteps(num);
        }else{
            num=num-1;
            steps++;
            return numberOfSteps(num);
        }
    }


    public static void main(String[] args) {
        System.out.println(new NumberOfStepsTillZero().numberOfSteps(8));
    }

}
