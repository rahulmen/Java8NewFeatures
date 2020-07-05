package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;

public class NextLargestNumber {

    public int nextLargest(int num){
        boolean isSwapped=false;
        String s = String.valueOf(num);
        String output="";
        l1:
        for(int i=s.length()-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(s.charAt(i)>s.charAt(j)){
                    isSwapped=true;
                    char temp = s.charAt(j);
                    StringBuilder stringBuilder = new StringBuilder(s);
                    stringBuilder.setCharAt(j,s.charAt(i));
                    stringBuilder.setCharAt(i,temp);
                    s=stringBuilder.toString();
                    output = s.substring(j+1);
                    break l1;
                }
            }
        }
        if(isSwapped==false){
            return num;
        }else {
            char[] ch = output.toCharArray();
            Arrays.sort(ch);
            String newOutput = String.copyValueOf(ch);
            return (Integer.valueOf(s) - Integer.valueOf(output)) + Integer.valueOf(newOutput);
        }
    }


    public static void main(String[] args) {
        System.out.println(new NextLargestNumber().nextLargest(534976));
    }
}
