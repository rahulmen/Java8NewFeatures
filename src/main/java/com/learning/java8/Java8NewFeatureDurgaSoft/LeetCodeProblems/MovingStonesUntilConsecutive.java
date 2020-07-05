package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;

public class MovingStonesUntilConsecutive {

    public int[] numMovesStones(int a, int b, int c) {
        int num1 = Math.abs(b-a);
        int num2 = Math.abs(c-b);
        int minMoves=0;int maxMoves=0;
        if(num1>1 || num2>1){
            minMoves=1;
        }
        if(num1>num2){
            maxMoves = num1-num2;
        }else{
            maxMoves = num2-num1;
        }
            return new int[]{minMoves,maxMoves};
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new MovingStonesUntilConsecutive().numMovesStones(1,7,2)));

    }
}
