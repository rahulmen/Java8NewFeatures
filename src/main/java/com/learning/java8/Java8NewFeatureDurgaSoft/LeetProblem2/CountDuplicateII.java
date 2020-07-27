package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.*;

public class CountDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
          if(!map.containsKey(nums[i])){
              map.put(nums[i],i);
          }else{
              int lastIndex = map.get(nums[i]);
              if(i-lastIndex<=k){
                  return true;
              }else{
                  map.put(nums[i],i);
              }
          }
      }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(new CountDuplicateII().containsNearbyDuplicate(new int[]{1,0,1,1},1));

    }
}
