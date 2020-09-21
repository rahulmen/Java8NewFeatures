package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class ArrayOddSum {

    public int sumOddLengthSubarrays(int[] arr) {
        int i=0;
        int j=1;
        int sum=0;

        while(j<=arr.length){
            while(i+j<=arr.length){
                int locali = 0;
                while(locali<j){
                    sum+=arr[locali+i];
                    locali++;
                }
                i++;
            }
           i=0;
           j+=2;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(new ArrayOddSum().sumOddLengthSubarrays(new int[]{1,4,2,5,3}));

    }
}
