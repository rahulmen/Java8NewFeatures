package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;

public class MergetwoSortedArray {


    /*public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[nums1.length];
        int i=0;int j=0;int k=0;
        while(i<m || j<n){

            if(i==m && j<n){
                temp[k]=nums2[j];
                 j++;
                 k++;
                 continue;
            }

            if(j==n && i<m){
                temp[k]=nums1[i];
                i++;
                continue;
            }
            if(nums1[i]<=nums2[j]){
                temp[k]=nums1[i];
                i++;
            }else if(nums1[i]>nums2[j]){
                temp[k]=nums2[j];
                j++;
            }
            k++;
        }
        System.out.println(Arrays.toString(temp));

        nums1=temp;
    }*/


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j=0,k=0,i=0;

        if(nums2.length==0){
            return;
        }

            while(i<nums1.length){
                    if(j<m) {
                        int z=nums1.length-2;
                        while (z >= j) {
                            nums1[z + 1] = nums1[z];
                            z--;
                        }
                        nums1[i] = nums2[k];
                        k++;
                        i++;
                    }else {
                        nums1[i] = nums2[k];
                        k++;i++;
                    }
            }

        }

    public static void main(String[] args) {

        int[] num1 = {2,0};
        int[] num2 ={1};

        new MergetwoSortedArray().merge(num1,1,num2,1);

        System.out.println(Arrays.toString(num1));

    }
}
