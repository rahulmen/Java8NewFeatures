package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class FIndMaximumSum {

    public int getMaxSum(int[] arr){
        int maxSum= Integer.MIN_VALUE;
        int localSum = 0;
        int negative = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
           if(arr[i]>0 && negative==Integer.MIN_VALUE){
               localSum+=arr[i];
           }else if(arr[i]>0 && negative!=Integer.MIN_VALUE){
               if(Math.abs(negative)<arr[i]){
                   localSum+=negative;
                   localSum+=arr[i];
               }else{
                   if(localSum>maxSum){
                       maxSum=localSum;
                   }
                   localSum=arr[i];
               }
           }else{
               negative=arr[i];
           }
        }
        if(localSum>maxSum){
            return localSum;
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr = {5,6,-10,12};
        System.out.println(new FIndMaximumSum().getMaxSum(arr));

    }

}
