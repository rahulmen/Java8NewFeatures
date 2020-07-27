package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class SumAndProduct {

    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int quotient=0;
        while(n>0){
            quotient=n%10;
            n=n/10;
            product*=quotient;
            sum+=quotient;
        }
        return product-sum;
    }

    public static void main(String[] args) {
        System.out.println(new SumAndProduct().subtractProductAndSum(234));
    }
}
