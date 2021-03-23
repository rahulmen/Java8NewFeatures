package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class MaxProfitStock {

    public int calculateMaxProfit(int[] arr) {

        int minStockValue = arr[0];
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>minStockValue){
                if(arr[i]-minStockValue>maxProfit){
                    maxProfit=arr[i]-minStockValue;
                }
            }else{
                minStockValue=arr[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4,4,6,7,7,4,3,3,4,5,6,6};
        System.out.println(new MaxProfitStock().calculateMaxProfit(arr));
    }

}
