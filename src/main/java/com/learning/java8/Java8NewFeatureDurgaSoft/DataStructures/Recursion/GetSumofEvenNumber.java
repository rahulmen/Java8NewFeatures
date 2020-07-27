package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

public class GetSumofEvenNumber {

    public int getSum(int num){
        if(num==0){
            return 0;
        }else{
            if(num%2==0)
            return num+getSum(num-2);
            else return getSum(num-1);

        }
    }

    public static void main(String[] args) {
        System.out.println(new GetSumofEvenNumber().getSum(9));
    }


}
