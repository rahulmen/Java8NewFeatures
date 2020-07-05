package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }

    //0,4,1,3,2
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CreateTargetArray().createTargetArray(new int[]{0,1,2,3,4},new int[]{0,1,2,2,1})));
    }
}
