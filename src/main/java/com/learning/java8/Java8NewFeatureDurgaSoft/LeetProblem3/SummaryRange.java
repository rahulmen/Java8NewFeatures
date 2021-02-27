package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.*;

public class SummaryRange {

    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();

        int count =0;
        String output ="";
        for(int i=0;i<nums.length-1;i++){
            if(count==0){
                output = "";
                output = nums[i]+"";
            }
            if(nums[i]+1==nums[i+1]){
                count++;
                continue;
            }
            //i = i-count;
            if(count>0){
                output+="->"+(nums[i]);
                count=0;
            }
            list.add(output);
        }

        if(nums[nums.length-1]-1!=nums[nums.length-2])
            list.add(nums[nums.length-1]+"");

        return list;
    }

    public static void main(String[] args) {

        System.out.println(new SummaryRange().summaryRanges(new int[]{0,1,2,4,5,7}));

    }
}
