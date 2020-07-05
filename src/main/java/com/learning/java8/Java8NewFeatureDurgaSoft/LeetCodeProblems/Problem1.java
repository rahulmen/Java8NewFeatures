package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;

public class Problem1 {

    public String getOutput(String s){
        StringBuilder stringBuilder = new StringBuilder();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int counter =1;
        for(int i=0;i<ch.length;i++){
            if(i<ch.length-1 && ch[i]==ch[i+1]){
                counter++;
            }else{
                stringBuilder.append(ch[i]+""+counter);
                counter=1;
            }
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(new Problem1().getOutput("aabbcacabbbbccedbhjdbwjbdwc"));
    }
}
