package com.learning.java8.Java8NewFeatureDurgaSoft.DunzoInterview;

/*
Given an array of integers, find out the pairs whose sum is equivalent to the integer given.
 */


import java.util.*;

public class QuestionOne {


    public List<int[]> getPairs(int[] arr,int pairSum){

        List<int[]> pair = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i:arr){
            int rem =pairSum-i;
            if(set.contains(rem)){
                pair.add(new int[]{i,rem});
            }else {
                set.add(i);
            }
        }
        return pair;
    }

    public static void main(String[] args) {

        for(int[] arr:new QuestionOne().getPairs(new int[]{2,3,4,5,4},7)){ //O(n)
            System.out.println(arr[1]+","+arr[0]);
        }

    }
}
