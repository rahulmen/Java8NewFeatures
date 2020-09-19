package com.learning.java8.Java8NewFeatureDurgaSoft;

import java.util.*;

public class NykaInterviewQuestion {

    public String modifyString(String s){
        Map<Character,Character> map = new HashMap<>();
        String string = "qwertyuiopasdfghjklzxcvbnm";
        for(int i=0;i<26;i++){
            map.put(string.charAt(i),string.charAt((i+1)%26));
        }
        map.put(' ',' ');
        char[] ch = s.toLowerCase().toCharArray();
        for(int i=0;i<ch.length;i++){
            ch[i] = map.get(ch[i]);
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        System.out.println(new NykaInterviewQuestion().modifyString("My Name Is Sachin"));
    }
}
