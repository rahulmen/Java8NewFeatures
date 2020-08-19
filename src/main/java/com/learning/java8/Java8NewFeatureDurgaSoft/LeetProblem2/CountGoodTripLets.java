package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.List;

public class CountGoodTripLets {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        int i = 0;
        int j = 1;
        int k = 2;
        int count = 0;

        //Getting min Index from where first condition stand true
        while (i < arr.length - 2) {
            if (j == arr.length - 1) {
                i++;
                j = i + 1;
                continue;
            }
            if (Math.abs(arr[i] - arr[j]) <= a) break;
             else j++;

        }
        int beginI = i;

        if (beginI == arr.length - 1) return 0;
        while (beginI < arr.length - 2) {
            j = beginI + 1;
            k = beginI + 2;
            while (j < arr.length - 1) {

                if (Math.abs(arr[beginI] - arr[j]) <= a
                        && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[beginI] - arr[k]) <= c) count++;

                if (k == arr.length-1) {
                    j++;
                    k = j + 1;
                } else {
                    k++;
                }
            }
            beginI++;
            Math.pow(1,2);
        }

        return count;
    }


    public static void main(String[] args) {

        System.out.println((int)(Math.log(10)/Math.log(1)));


//        System.out.println(new CountGoodTripLets().countGoodTriplets(new int[]{3,0,1,1,9,7},7,2,3));

    }
}
