package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.HashMap;
import java.util.Map;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String S) {

        Map<Integer,Character> map = new HashMap<>();
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();


        for(int i=0;i<S.length();i++) {
            int ascii = S.charAt(i);
            if(ascii<65 || (ascii>90 && ascii<97) || ascii>122){
                map.put(i,S.charAt(i));
            }
        }

        for(int i=S.length()-1;i>=0;i--) {
            int ascii = S.charAt(i);
            if(!(ascii<65 || (ascii>90 && ascii<97) || ascii>122)){
                s.append(S.charAt(i));
            }
        }

        int count=0;

        for(int i=0;i<S.length();i++){
            if(map.containsKey(i)){
                count++;
                s1.append(map.get(i));
            }else{
               s1.append(s.charAt(i-count));
            }
        }
        return s1.toString();
    }

    public static void main(String[] args) {

//A 65 Z 90 a 97 z 122

        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj"));

    }
}
