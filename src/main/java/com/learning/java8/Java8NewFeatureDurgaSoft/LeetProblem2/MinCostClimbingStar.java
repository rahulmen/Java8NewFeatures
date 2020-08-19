package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class MinCostClimbingStar {

    public int minCostClimbingStairs(int[] cost) {
        int i1=0;int i2=0;
     for(int i=cost.length-1;i>=0;i--){
         int i3 = cost[i]+Math.min(i1,i2);
         i2=i1;
         i1=i3;
     }

     return Math.min(i1,i2);
    }

    public static void main(String[] args) {

        System.out.println(new MinCostClimbingStar().minCostClimbingStairs(new int[]{0,1,2,2}));
    }
}
