package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> integerIntegerMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(integerIntegerMap.containsKey(rem)){
                return new int[]{integerIntegerMap.get(rem),i};
            }else{
                integerIntegerMap.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException();
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] num = new TwoSum().twoSum(arr,17);
        System.out.println(Arrays.toString(num));
    }

}
