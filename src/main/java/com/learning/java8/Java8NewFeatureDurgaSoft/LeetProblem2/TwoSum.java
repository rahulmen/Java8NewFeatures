package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            int num = target-numbers[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num),i+1};
            }else{
                map.put(numbers[i],i+1);
            }
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2,7,11,15},9)));
    }
}
