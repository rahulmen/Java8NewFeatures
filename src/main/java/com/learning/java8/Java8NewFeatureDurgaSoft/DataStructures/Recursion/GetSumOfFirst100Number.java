package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

public class GetSumOfFirst100Number {

    public int getFirst100Sum(int num){
        if(num==0){
            return 0;
        }else{
             return num + getFirst100Sum(--num);
        }
    }


    public static void main(String[] args) {

        System.out.println(new GetSumOfFirst100Number().getFirst100Sum(10));


    }

}
