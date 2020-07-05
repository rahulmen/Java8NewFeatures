package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;

public class HowManyNumberAreSmallerThanCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }

        for(int i=0;i<nums.length;i++){
            int count =0;
            for(Map.Entry e:map.entrySet()){
                if((int)e.getKey()<nums[i]){
                    count+=(int)e.getValue();
                }
            }
            nums[i]=count;
        }
        return nums;
    }

    public int[] smallerNumbersThanCurrent1(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            nums[i]=count;
        }
        return nums;
    }


    public int[] smallerNumbersThanCurrent3(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int counter =0;
        for(int n:nums){
            if(!map.containsKey(n)){
                map.put(n,counter);
            }
            counter++;
        }

        int[] res = new int[ nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=map.get(temp[i]);
        }
    return res;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(new HowManyNumberAreSmallerThanCurrentNumber().smallerNumbersThanCurrent3(new int[]{3,2,3,4,6,3,21,3})));
    }
}
