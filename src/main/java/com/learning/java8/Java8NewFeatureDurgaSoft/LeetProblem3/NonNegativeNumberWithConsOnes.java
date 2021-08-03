package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class NonNegativeNumberWithConsOnes {

    public boolean isBoolean(int j){
        boolean isOne = false;

        while(j>0){
            if(isOne==true && (j&1)==1){
                return false;
            }
            else if((j&1)==1 && isOne==false){
                isOne=true;
            }
            else if((j&1)==0){
                isOne=false;
            }
            j=j>>1;
        }
        return true;

    }

    public int findIntegers(int n) {

        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (isBoolean(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NonNegativeNumberWithConsOnes().findIntegers(10));

    }
}
