package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class NumberSubSeq {

    public int numSubseq(int[] arr, int target) {

        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]+arr[i]<=target)count++;
            for(int j=i+1;j<arr.length;j++){
                if(j<arr.length){
                    if(arr[i]+arr[j]<=target)count++;
                    if(arr[i]+arr[j]<=target && (j-i)>1)count+=(j-i);
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(new NumberSubSeq().numSubseq(new int[]{2,3,3,4,6,7},12));

        Set<Integer> set = new TreeSet<>();


    }
}
