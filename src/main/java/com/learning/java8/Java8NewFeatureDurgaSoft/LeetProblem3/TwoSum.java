package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.*;

public class TwoSum {

    public List<List<Integer>> getTwoSum(int[] arr,int target){
        List<List<Integer>> output = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i:arr) {
            if (set.contains(target - i)) {
                output.add(Arrays.asList(i, target - i));
            } else {
                set.add(i);
            }
        }
        return output;
    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int i=0;
        int j=i+1;

        while(i<nums.length-1){

            if(i!=j){
                if(set.contains(0-(nums[i]+nums[j]))){
                    output.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],0-(nums[i]+nums[j]))));
                }else{
                    set.add(nums[i]);
                    set.add(nums[j]);
                }
            }

            if(j==nums.length-1){
                i++;
                j=i+1;
            }else{
                j++;
            }

        }
        return output;
    }

    public void getFirstOccuranceIndex(int[] arr,int target){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                System.out.println(map.get(target-arr[i])+","+i);
                break;
            }else{
                map.put(arr[i],i);
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-2,0,-1};

        System.out.println(new TwoSum().getTwoSum(arr,0));
        new TwoSum().getFirstOccuranceIndex(arr,0);

    }

}
