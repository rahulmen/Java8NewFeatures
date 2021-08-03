package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCode4;

public class ContainsPattern {

    public boolean containsPattern(int[] arr, int m, int k) {

        if(arr.length<(m*k)) return false;
        int patternCount = 0;
        int[] temp1 = null,temp2 = null;
        int i=0;
        while(i<arr.length-m){
            if(temp1==null && temp2==null){
                temp1= new int[m];
                for(int i1=0;i1<m;i1++){
                    temp1[i1]=arr[i1];
                    i++;
                }
                patternCount++;
                continue;
            }else{
                temp2 = temp1;
                temp1= new int[m];
                for(int i1=0;i1<m;i1++){
                    temp1[i1]=arr[i1+m];
                    i++;
                }
            }
                int arr1Index=0;
                int arr2Index=0;
                boolean b = true;
                while(arr1Index<m && arr2Index<m){
                    if(temp1[arr1Index]!=temp2[arr2Index]){
                        b = false;
                    }
                    arr1Index++;
                    arr2Index++;
                }
                if(b==true){
                    patternCount++;
                    if(patternCount==k){
                        return true;
                    }
                }else{
                    patternCount=0;
                }
            }
        i += m;
        return false;
    }

    public static void main(String[] args) {
        

    }
}
