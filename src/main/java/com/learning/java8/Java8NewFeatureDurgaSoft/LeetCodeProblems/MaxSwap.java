package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class MaxSwap {

    public int maximumSwap(int num) {

        char[] charArray = String.valueOf(num).toCharArray();

        for(Character c:charArray){



        }




return 1;
    }

    public static void main(String[] args) {

       int num =  new MaxSwap().maximumSwap(2736);
        System.out.println(num);

        /*
         int max = 0;
        int temp = num;
         int remainder =0;

        while(temp>10){
            remainder = temp%10;
            temp = temp/10;
            if(remainder>max){
                max=remainder;
            }
        }

        return Integer.valueOf(max+""+temp+"");
         */

    }

}
