package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCode4;

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i:nums){
            if(map.containsKey(target-i)){
                return new int[]{map.get(target-i),count};
            }
            map.put(nums[i],count);
            count++;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{3,2,4},6)));
    }
}
