package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class DuplicateZeros {

    public int[] duplicateZeros(int[] arr) {

        LinkedList linkedList = new LinkedList();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                linkedList.add(0);
                linkedList.add(0);
            }else{
                linkedList.add(arr[i]);
            }
        }

        int count =0;
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while(listIterator.hasNext() && count<arr.length){
            arr[count]=listIterator.next();
            count++;
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new DuplicateZeros().duplicateZeros(new int[]{0,1,7,6,0,2,0,7})));


    }
}
