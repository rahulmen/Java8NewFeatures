package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestCharLenght {

    public int[] shortestToChar(String S, char C) {

        List<Integer> list = new ArrayList<>();
        int[] output = new int[S.length()];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==C){
                list.add(i);
            }
        }
        int count=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==C && i==list.get(count)){
                output[i]=0;
                count++;
                continue;
            }

            if(count==0 && i<list.get(count)){
                output[i]=list.get(count)-i;
            }else{
                if(list.get(count)-i>i-list.get(count-1)){
                    output[i]=i-list.get(count-1);
                }else{
                    output[i]=list.get(count)-i;
                }
            }
        }
        return output;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(new ShortestCharLenght().shortestToChar("loveleetcode",'e')));

    }
}
