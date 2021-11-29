package com.learning.java8.Java8NewFeatureDurgaSoft.Messsho;

//{1,2,3,4,5,6} ,  key=5

public class Question1 {

    public int getIndex(int[] arr,int key){

        int begin =0;
        int end = arr.length-1;

        int medium = 0;

        while (begin<=end){

            medium = (end+begin)/2;

            if(medium >0 && arr[medium]==key && arr[medium-1]!=key){
                return medium;
            }else if(medium == 0 && arr[medium]==key){
                return medium;
            }
            else if(medium==0 && arr[medium]==key){
                return medium;
            }
            else if(arr[medium]<key){
                begin=medium+1;
            }else {
                end = medium - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(new Question1().getIndex(new int[]{3,4,2,3,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},5));
   }


}
