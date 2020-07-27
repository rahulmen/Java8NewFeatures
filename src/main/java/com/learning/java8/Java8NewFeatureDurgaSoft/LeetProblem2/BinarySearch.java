package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class BinarySearch {

    public int binarySearch(int[] nums,int num){
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+((right-left)/2);
            if(nums[mid]==num){
                return mid;
            }
            if(nums[mid]>num){
                left = 0;
                right=mid-1;
                continue;
            }else{
                left = mid+1;
                right = nums.length-1;
                continue;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] nums = {3,6,8,9,90,999,2345};

        System.out.println(new BinarySearch().binarySearch(nums,3));

    }
}
