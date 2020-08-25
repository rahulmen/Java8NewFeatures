package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class KthMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {

        int[] temp = new int[1000];
        
        int count = 0;
        int j = 0;
        for (int i = 1; i <= 1000; i++) {
            if (count < arr.length && arr[count] == i) {
                count++;
            } else {
                temp[j] = i;
                j++;
            }
            System.out.println(j);
            if (j == k) {
                return temp[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(new KthMissingPositiveNumber().findKthPositive(new int[]{2,3,4,7,11},5));

    }


    }
