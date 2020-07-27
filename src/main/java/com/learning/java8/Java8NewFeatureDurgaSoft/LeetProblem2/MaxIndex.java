package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class MaxIndex {

    int maxIndex;
    int counter =1;

    public int peakIndexInMountainArray(int[] A) {
        if(counter==A.length){
            return maxIndex;
        }
       else if(counter<=A.length-1 && A[counter]>A[counter-1] && A[counter]>A[counter+1]){
           maxIndex=counter;
           counter++;
           return peakIndexInMountainArray(A);
       }else{
           counter++;
           return peakIndexInMountainArray(A);
       }
    }


    public static void main(String[] args) {

        System.out.println(new MaxIndex().peakIndexInMountainArray(new int[]{3,4,5,1}));

    }
}
