package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.Arrays;
import java.util.function.Function;

public class FreeAlphabet {

    public String freqAlphabets(String s) {

        StringBuilder sb1 = new StringBuilder();
         int[] arr = new int[]{3,43,233};
        int i=0;
        while(i<s.length()){
            String str ="";
            if(i<s.length()-2 && s.charAt(i+2)=='#'){
                char letter = (char)((Integer.valueOf(s.substring(i , i + 2)) - 1) + 'a');
                i=i+3;
                sb1.append(letter);
            }else{
                char letter = (char)((Integer.valueOf(s.substring(i , i + 1)) - 1) + 'a');
                sb1.append(letter);
                i=i+1;
            }
        }
        return sb1.toString();
    }

    public static void main(String[] args) {

        System.out.println(new FreeAlphabet().freqAlphabets("10#11#12"));


    }
}
