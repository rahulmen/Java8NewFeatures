package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersaction {


    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> list1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i:nums2){
            set2.add(i);
        }

        int i = nums1.length-1;

        while(i>=0){
            if(set2.contains(nums1[i])){
                list1.add(nums1[i]);
            }
            i--;
        }

        int[] num = new int[list1.size()];
        int counter =0;
        for (int j:list1){
           num[counter]=j;
           counter++;
        }
        return num;
    }

    public static void main(String[] args) {

        new Intersaction().intersection(new int[]{4,9,5},new int[]{9,4,9,8,4});

    }
}
