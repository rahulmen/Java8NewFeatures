package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class FindSumWithoutArithmetic {

    public int getSum(int a, int b) {
        if (b == 0)
            return a;
        else
            return getSum( a ^ b, (a & b) << 1);

    }

    public static void main(String[] args) {

        System.out.println(new FindSumWithoutArithmetic().getSum(2,3));

        System.out.println(3^3);
        System.out.println(3^2);
        System.out.println(2^3);
        System.out.println("==============");
        System.out.println(3&3);
        System.out.println(3&2);
        System.out.println(2&3);
        System.out.println("==============");
        System.out.println((3&3) << 1);
        System.out.println((2&3) << 1);
        System.out.println((3&2) << 1);




    }
}
