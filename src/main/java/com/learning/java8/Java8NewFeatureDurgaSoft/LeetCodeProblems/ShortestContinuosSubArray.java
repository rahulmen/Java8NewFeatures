package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortestContinuosSubArray {


    public int findUnsortedSubarray(int[] nums) {

        ArrayList<Integer> integerArrayList1 = (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());
        Arrays.sort(nums);
        ArrayList<Integer> integerArrayList2 = (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());
        int small=1,large=0;
        int counter =0;
        for(int i=0;i<nums.length;i++){
            if(integerArrayList1.get(i).equals(integerArrayList2.get(i))){
                continue;
            }else{
                if(counter==0){
                    small=i;
                    counter++;
                }else {
                    large = i;
                }
            }
        }
        return large-small+1;

    }

    public static void main(String[] args) {

        System.out.println(new ShortestContinuosSubArray().findUnsortedSubarray(new int[]{1,2,3,4,5,65,45,23,23,23,44,100,101,102,103,342,512,312,423,454,623,231,111,235,1001,1002,1003,1004}));

    }

}
