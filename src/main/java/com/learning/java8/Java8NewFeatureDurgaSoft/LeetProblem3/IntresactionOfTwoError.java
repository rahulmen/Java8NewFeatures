package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.*;

public class IntresactionOfTwoError {

    public int[] intersect(int[] nums1, int[] nums2) {

        List<List<Integer>> list = new ArrayList<>();

        l1:
        for(int i=0;i<nums1.length;i++){
            List<Integer> list1 = new ArrayList<>();
            l2:
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    list1.add(nums1[i]);
                    i++;
                }else{
                    list.add(list1);
                    continue l1;
                }
            }
        }

        List<Integer> out = null;int length = 0;

        for(List<Integer> l:list){
            if(length==0){
                length=l.size();
                out = l;
            }else{
                if(l.size()>length){
                    out=l;
                }
            }
        }
        int[] myArray = new int[out.size()];
        int count = 0;
        for(int i:out){
            myArray[count]=i;
            count++;
        }
        return myArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new IntresactionOfTwoError().intersect(new int[]{1,2,1,1},new int[]{1,1})));
    }


}
