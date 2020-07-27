package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairs {

    public int findPairs(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        //Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(Math.abs(nums[i]-nums[j])==k) {
                    if(map.isEmpty()) {
                        map.put(nums[i], nums[j]);
                        map.put(nums[j], nums[i]);
                        count++;
                        continue;
                    }
                    else if ((map.containsKey(nums[i]) && map.get(nums[i]) == nums[j])) {
                        continue;
                    }else if((map.containsKey(nums[j]) && map.get(nums[j]) == nums[i])){
                        continue;
                    } else {
                        map.put(nums[i], nums[j]);
                        map.put(nums[j], nums[i]);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(new FindPairs().findPairs(new int[]{1,1,1,1,1,2,2},0));

    }
}
