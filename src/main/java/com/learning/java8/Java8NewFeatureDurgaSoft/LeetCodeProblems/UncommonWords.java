package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;

public class UncommonWords {

    public String[] uncommonFromSentences(String A, String B) {
        List<String> stringArrayList = new ArrayList<>();
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(String s:A.split(" ")){
            if(map1.containsKey(s)){
                map1.put(s,map1.get(s)+1);
            }else{
                map1.put(s,1);
            }
        }
        for(String s:B.split(" ")){
            if(map2.containsKey(s)){
                map2.put(s,map2.get(s)+1);
            }else{
                map2.put(s,1);
            }
        }
        map1.entrySet().stream().forEach(e->{
            if(!map2.containsKey(e.getKey()) && e.getValue()==1){
                stringArrayList.add(e.getKey());
            }
        });

        map2.entrySet().stream().forEach(e->{
            if(!map1.containsKey(e.getKey()) && e.getValue()==1){
                stringArrayList.add(e.getKey());
            }
        });
        String[] strings = new String[stringArrayList.size()];
        for(int i=0;i<stringArrayList.size();i++){
            strings[i]=stringArrayList.get(i);
        }
        return strings;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new UncommonWords().uncommonFromSentences("abcd def abcd xyz"
                ,"ijk def ijk")));


    }
}
