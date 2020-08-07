package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectSquateRoot {

        public boolean isPerfectSquare1(int temp) {

            int i=0;
            int num =temp/4;
            while(i<=num){
                int mid = (i+num)/2;
                double d = mid*mid;
                if(d==temp){
                    return true;
                }else if(Math.abs(d)>(double)temp){
                    num=mid-1;
                }else{
                    i=mid+1;
                }
            }
            return false;
        }

    public boolean isPerfectSquare(int num) {
        int oddSum = 1;

        while(num > 0) {
            num -= oddSum;
            oddSum += 2;
        }

        return num == 0? true : false;
    }

    public static void main(String[] args) {

        System.out.println(new PerfectSquateRoot().isPerfectSquare(2147395600)); //46340

    }
}
