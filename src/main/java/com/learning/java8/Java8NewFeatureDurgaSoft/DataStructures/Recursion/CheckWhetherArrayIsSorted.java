package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

public class CheckWhetherArrayIsSorted {

    public int isArraySorted(int[] arr,int index){
        if(index==1 || arr.length==1){
            return 1;
        }else{
            return arr[index-1]<arr[index-2]?0:isArraySorted(arr,index-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(new CheckWhetherArrayIsSorted().isArraySorted(arr,arr.length));


    }
}
