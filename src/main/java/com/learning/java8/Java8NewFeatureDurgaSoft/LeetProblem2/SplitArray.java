package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class SplitArray {

    public boolean isPossible(int[] nums) {

        int i=0;
        int index = i+1;
        int counter = 0;
        //int output=0;

        while(i<nums.length-1 && index<nums.length){

//            if(counter==2){
//                //output++;
//                i++;
//                index=i+1;
//                counter=0;
//            }

            if(nums[index]-nums[i]==1){
                //i++;
                index++;
                counter++;
            }else if(nums[index]==nums[i]){
                index++;
                continue;
            }

        }

        if(counter%2==0){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(new SplitArray().isPossible(new int[]{1,2,3,3,4,4,5,5}));
    }
}
