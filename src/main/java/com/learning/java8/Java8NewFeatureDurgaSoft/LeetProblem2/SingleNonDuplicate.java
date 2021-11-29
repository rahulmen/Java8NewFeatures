package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class SingleNonDuplicate {

    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length;
        int mid = (low+high)/2;
        if(mid%2==0 && nums[mid]==nums[mid+1]){
            mid=mid+1;
            high = mid;
        }else{
            mid= mid-1;
            low = mid;
        }
        while(low<high){
            mid = (low+high)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }else if(mid%2!=0){
                mid = mid+1;
                high = mid;
            }else{
                mid= mid-1;
                low = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNonDuplicate().singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }
}
