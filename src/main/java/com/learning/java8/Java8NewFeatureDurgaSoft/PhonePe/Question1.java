package com.learning.java8.Java8NewFeatureDurgaSoft.PhonePe;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Question1 {

    public List<List<String>> getAnagram(String[] str){

        List<List<String>> list = new ArrayList<>();

        for(int i=0;i<str.length-1;i++) {
            for (int j = i + 1; j < str.length; j++) {
                if(str[i].length()!=str[j].length())
                    continue;

                char[] ch1 = str[i].toCharArray();
                char[] ch2 = str[j].toCharArray();

                Arrays.sort(ch1);
                Arrays.sort(ch2);

                StringBuilder str1 = new StringBuilder();
                StringBuilder str2 = new StringBuilder();
                for(char ch:ch1) str1.append(ch);
                for(char ch:ch2) str2.append(ch);

                if(str1.toString().equals(str2.toString())){
                    list.add(new ArrayList<>(Arrays.asList(str[i],str[j])));
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {

        System.out.println(new Question1().getAnagram(new String[] {"abc","def","ghi","bca","fed"}));


    }



}
