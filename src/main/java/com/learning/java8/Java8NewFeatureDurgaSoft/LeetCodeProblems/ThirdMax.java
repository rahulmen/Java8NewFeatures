package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdMax {

    public int thirdMax(int[] nums) {
        int max=0;
        if(nums.length==0){
            return 0;
        }
        TreeSet<Integer> treeSet = new TreeSet<>((i1,i2)->-i1.compareTo(i2));
        for(int n:nums){
            treeSet.add(n);
        }
        if(treeSet.size()<3){
            return treeSet.first();
        }else{
            int counter =0;
            for(int i:treeSet){
                if(counter==2){
                    max =i;
                    break;
                }
                counter++;
            }

        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(new ThirdMax().thirdMax(new int[]{1,2,2,2,2,2,0}));

    }
}
